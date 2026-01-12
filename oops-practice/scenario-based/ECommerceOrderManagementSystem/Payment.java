package scenario_based.ECommerceOrderManagementSystem;

public interface Payment {
	
	 void Pay(double amount) throws  PaymentFailedException;

}
