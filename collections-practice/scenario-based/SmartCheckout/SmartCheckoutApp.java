package SmartCheckout;

public class SmartCheckoutApp {
	
	public static void main(String[] args) {

        CheckoutCounter counter = new CheckoutCounter();

        Customer c1 = new Customer("Rishabh");
        c1.addItem("Milk", 2);
        c1.addItem("Bread", 1);

        Customer c2 = new Customer("Amit");
        c2.addItem("Eggs", 12);
        c2.addItem("Milk", 1);

        counter.addCustomer(c1);
        counter.addCustomer(c2);

        counter.processCustomer();
        counter.processCustomer();
        counter.processCustomer(); // empty queue
    }

}
