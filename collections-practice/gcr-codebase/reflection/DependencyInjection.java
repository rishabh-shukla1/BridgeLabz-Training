package reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject 
{
}


class Service {
    public void serve()
    {
        System.out.println("Service is working...");
    }
}

class Client {

    @Inject
    private Service service;

    public void doWork() 
    {
        service.serve();
    }
}


class DIContainer {

    public static <T> T createObject(Class<T> clazz) throws Exception {

    
        T obj = clazz.getDeclaredConstructor().newInstance();

   
        for (Field field : clazz.getDeclaredFields()) {

            if (field.isAnnotationPresent(Inject.class)) {

              
                Class<?> fieldType = field.getType();
                Object dependency = fieldType.getDeclaredConstructor().newInstance();

                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }
        return obj;
    }
}

// 5. Main
public class DependencyInjection {
    public static void main(String[] args) throws Exception {

        Client client = DIContainer.createObject(Client.class);
        client.doWork();
    }
}

