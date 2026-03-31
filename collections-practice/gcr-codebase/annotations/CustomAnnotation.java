package annotations;


import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo{
	int priority();
	String assignedTo();
	
}

class TaskManager{

	@TaskInfo(priority=1 ,assignedTo="rishabh")
	public void completeTask() {
		
		System.out.println("Task is being completed...");
	}
	
	
	
}

public class CustomAnnotation {
	
	 public static void main(String[] args) throws Exception {
		 
		 TaskManager t=new TaskManager();
		 
		 Class<?> c=t.getClass();
		 
		 Method m=c.getMethod("completeTask");
		 
		   TaskInfo info=m.getAnnotation(TaskInfo.class);
		   
		   System.out.println("Priority: " + info.priority());
	       System.out.println("Assigned To: " + info.assignedTo());
		   
		   
		 
		 
		 
	 }

}
