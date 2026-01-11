package scenario_based.vehicle_system;

public class Customer {
	
	private int customerId;
	private String name;
	
    Customer(int customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}
    
    public void displayCustomer()
    {
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
    }
	
	

}
