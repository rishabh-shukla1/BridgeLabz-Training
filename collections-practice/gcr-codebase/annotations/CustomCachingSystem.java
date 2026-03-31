package annotations;


import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}

class Calculator {

    @CacheResult
    public int slowSquare(int n) {
        try {
            Thread.sleep(2000); 
        } catch (Exception e) {}

        return n * n;
    }
}

class CacheManager {

    private static Map<String, Object> cache = new HashMap<>();

    public static Object invoke(Object obj, String methodName, Object... args) throws Exception {

        Method method = obj.getClass().getMethod(methodName, int.class);

     
        if (method.isAnnotationPresent(CacheResult.class)) {

            String key = methodName + args[0];

            
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result...");
                return cache.get(key);
            }

          
            System.out.println("Computing result...");
            Object result = method.invoke(obj, args);
            cache.put(key, result);
            return result;
        }

     
        return method.invoke(obj, args);
    }
}

public class CustomCachingSystem {
	
	 public static void main(String[] args) throws Exception {

	        Calculator calc = new Calculator();

	        System.out.println(CacheManager.invoke(calc, "slowSquare", 5));
	        System.out.println(CacheManager.invoke(calc, "slowSquare", 5)); 
	        System.out.println(CacheManager.invoke(calc, "slowSquare", 6));
	        System.out.println(CacheManager.invoke(calc, "slowSquare", 6)); 
	    }

}
