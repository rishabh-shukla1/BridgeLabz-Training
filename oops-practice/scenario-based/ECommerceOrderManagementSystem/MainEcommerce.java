package scenario_based.ECommerceOrderManagementSystem;

public class MainEcommerce {
	
	public static void main(String[] args)
    {
        Product p1 = new Product(101, "Laptop", 75000);
        Customer c1 = new Customer(1, "Rishabh");

        Order order = new Order(5001, c1, p1);

        Payment payment;

        payment = new Upi();
        order.placeOrder(payment);

        order.trackOrder();

        order.cancelOrder();
        order.trackOrder();
    }

}
