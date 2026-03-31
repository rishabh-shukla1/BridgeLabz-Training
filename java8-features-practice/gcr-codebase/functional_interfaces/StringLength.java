package functional_interfaces;

import java.util.function.Function;

public class StringLength {
	
	 public static void main(String[] args) {
		 
		 Function<String, Integer> f=m->m.length();
		 
		 String message = "Welcome to StreamBuzz";

	        int len = f.apply(message);
	        System.out.println("Length: " + len);
		 
		 
	 }

}
