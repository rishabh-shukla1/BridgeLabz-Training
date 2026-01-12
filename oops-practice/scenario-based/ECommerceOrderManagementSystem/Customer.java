package scenario_based.ECommerceOrderManagementSystem;

public class Customer {
	
	private int customerId;
	private String CusName;
	
	 Customer(int customerId, String cusName) {
		
		this.customerId = customerId;
		CusName = cusName;
	}

	 public int getCustomerId() {
		 return customerId;
	 }


	 public String getCusName() {
		 return CusName;
	 }


}
