package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";  
}

class Service {

	@ImportantMethod 
    public void startService() {
        System.out.println("Service started");
    }

    @ImportantMethod(level = "LOW")
    public void stopService() {
        System.out.println("Service stopped");
    }

    public void helperMethod() {
        System.out.println("Helper method");
    }
}


public class MarkImportantMethod {
	
	 public static void main(String[] args) {

	        Method[] methods = Service.class.getDeclaredMethods();

	        for (Method m : methods) {
	            if (m.isAnnotationPresent(ImportantMethod.class)) {

	                ImportantMethod im = m.getAnnotation(ImportantMethod.class);

	                System.out.println("Method: " + m.getName());
	                System.out.println("Level: " + im.level());
	                System.out.println();
	            }
	        }
	    }

}
