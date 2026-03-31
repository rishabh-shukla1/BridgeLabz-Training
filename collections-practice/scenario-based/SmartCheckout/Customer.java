package SmartCheckout;
import java.util.*;

public class Customer {
	
    private String customerName;
    private HashMap<String, Integer> items; 

    public Customer(String customerName) {
        this.customerName = customerName;
        this.items = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        items.put(itemName, quantity);
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public String getCustomerName() {
        return customerName;
    }

}
