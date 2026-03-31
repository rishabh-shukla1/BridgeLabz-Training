package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    private String customer;
    private double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    String getCustomer() {
        return customer;
    }

    double getAmount() {
        return amount;
    }
}

public class OrderRevenueSummary {
	
	 public static void main(String[] args) {

	        List<Order> orders = List.of(
	            new Order("Ravi", 500.0),
	            new Order("Amit", 700.0),
	            new Order("Ravi", 300.0),
	            new Order("Neha", 400.0)
	        );
	        
	        
	       Map<String,Double> ans=orders.stream()
	    		   						.collect(Collectors.groupingBy(c->c.getCustomer(),Collectors.summingDouble(c->c.getAmount())));
	       
	       System.out.println(ans);


}
}
