package reflection;

import java.lang.reflect.*;
import java.util.*;

public class GetClassInformation {
	
	public static void main(String args[]) {
		
		    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter class name:-");
	        String className = sc.nextLine();
	        
	        try {
	        	
	        	Class<?> c=Class.forName(className);
	        	
	        	System.out.println("Class Name: " + c.getName());
	        	
	        	Constructor<?>[] cons=c.getDeclaredConstructors();
	        	System.out.println("\n--- Constructors ---");
	        	for(Constructor<?> cs:cons) {
	        		
	        		System.out.println(cs);
	        	}
	        	
	        	// Fields
	            System.out.println("--- Fields ---");
	            Field[] fields = c.getDeclaredFields();
	            
	            for (Field f : fields) {
	                System.out.println(f);
	            }
	        	
	            System.out.println("\n--- Methods ---");
	        	Method method[]=c.getDeclaredMethods();
	        	for (Method m :method ) {
	                System.out.println(m);
	            }
	        	
	        	
	        }
	        catch(ClassNotFoundException e) {
	        	
	        	 System.out.println("Class not found!");
	        	
	        }
	        

	}

}
