package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime 
{}

class Services {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1_000_000; i++) { }
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 50_000_000; i++) { }
    }

    public void normalMethod() {
        System.out.println("Not measured");
    }
}

public class LoggingMethodExecution {

    public static void main(String[] args) throws Exception {

        Services service = new Services();
        Method[] methods = Services.class.getDeclaredMethods(); 

        for (Method m : methods) {

            if (m.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                m.invoke(service);
                long end = System.nanoTime();

                long timeTaken = end - start;

                System.out.println("Method: " + m.getName());
                System.out.println("Time Taken: " + timeTaken + " ns");
                System.out.println("-----------------------");
            }
        }
    }
}
