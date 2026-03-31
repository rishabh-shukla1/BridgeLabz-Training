package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {

    @Todo(task = "Implement login feature", assignedTo = "Rishabh", priority = "HIGH")
    public void login() { }

    @Todo(task = "Add payment gateway", assignedTo = "Amit")
    public void payment() { }

    @Todo(task = "Improve UI design", assignedTo = "Neha", priority = "LOW")
    public void ui() { }
}

public class AnnotationPendingTasks {
	
	 public static void main(String[] args) {

	        Method[] methods = Project.class.getDeclaredMethods();

	        for (Method m : methods) {
	            if (m.isAnnotationPresent(Todo.class)) {

	                Todo todo = m.getAnnotation(Todo.class);

	                System.out.println("Method: " + m.getName());
	                System.out.println("Task: " + todo.task());
	                System.out.println("Assigned To: " + todo.assignedTo());
	                System.out.println("Priority: " + todo.priority());
	                System.out.println("-------------------------");
	            }
	        }
	    }

}
