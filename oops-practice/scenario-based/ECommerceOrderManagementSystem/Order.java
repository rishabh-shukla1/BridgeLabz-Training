package scenario_based.ECommerceOrderManagementSystem;

public class Order {
	
	private int orderId;
	private Customer customer;
	private Product product;
	private String status;
	
	public Order(int orderId, Customer customer, Product product) {
		this.orderId = orderId;
		this.customer = customer;
		this.product = product;
		this.status="Created";
	}
	
	 double amount() {
		
		return product.getPrice();
	}
	 
	void  placeOrder(Payment p) {
		
		try {
			
			p.Pay(amount());
			System.out.println("Placed Successfully");
			status="Confirmed";
			}
		catch(PaymentFailedException e) {
			
			System.out.println("Error:-"+e.getMessage());
		}
		
		
	}
	
	void cancelOrder(){
		
		if(status=="Confirmed") {
			status="Cancelled";
		}
		else 
		{
			System.out.println("Not Booked Only");
		}
		
		
   }
	
	void trackOrder()
    {
        System.out.println("Order Status: " + status);
    }
	

}
