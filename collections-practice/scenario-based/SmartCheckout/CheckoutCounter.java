package SmartCheckout;
import java.util.*;

public class CheckoutCounter {
	
	 private Queue<Customer> customerQueue;
	    private HashMap<String, Item> itemMap;

	    public CheckoutCounter() {
	        customerQueue = new LinkedList<>();
	        itemMap = new HashMap<>();

	        // adding items to store
	        itemMap.put("Milk", new Item("Milk", 50, 10));
	        itemMap.put("Bread", new Item("Bread", 30, 15));
	        itemMap.put("Eggs", new Item("Eggs", 6, 50));
	    }

	    // add customer to queue
	    public void addCustomer(Customer customer) {
	        customerQueue.add(customer);
	        System.out.println(customer.getCustomerName() + " added to queue");
	    }

	    // remove customer after billing
	    public void processCustomer() {

	        if (customerQueue.isEmpty()) {
	            System.out.println("No customers in queue");
	            return;
	        }

	        Customer customer = customerQueue.poll();
	        int totalBill = 0;

	        System.out.println("\nBilling for " + customer.getCustomerName());

	        for (String itemName : customer.getItems().keySet()) {

	            int quantity = customer.getItems().get(itemName);
	            Item item = itemMap.get(itemName);

	            if (item != null && item.getStock() >= quantity) {

	                totalBill = totalBill + (item.getPrice() * quantity);
	                item.reduceStock(quantity);

	            } else {
	                System.out.println(itemName + " is out of stock");
	            }
	        }

	        System.out.println("Total Bill:-" + totalBill);
	    }

}
