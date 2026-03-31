package lambda_expressions;

import java.util.*;
import java.util.function.*;

public class Notifications {
	 public static void main(String[] args) {

	        List<String> alerts =
	            List.of("Emergency","General","Billing");
	        
	        Predicate<String> p=a->a.equals("Emergency");
	        
	        alerts.stream().filter(p).forEach(System.out::println);
	        

	 }
}
