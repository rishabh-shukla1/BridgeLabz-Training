package scenario_based.ECommerceOrderManagementSystem;

public class Wallet implements Payment {

	@Override
	public void Pay(double amount) throws PaymentFailedException {
		// TODO Auto-generated method stub
		if(amount<0)
		{
			throw new PaymentFailedException("Invalid Payment");
		}
		
		System.out.println("Payment done Successfully By the Wallet");
		
	}
}
