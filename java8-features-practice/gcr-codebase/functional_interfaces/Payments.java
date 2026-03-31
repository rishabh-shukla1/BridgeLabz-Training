package functional_interfaces;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
	
	@Override
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class CreditCard implements Payment {
	
	@Override
    public void pay(double amount) {
        System.out.println("Paid via Credit Card: " + amount);
    }
}

class Wallet implements Payment {
	
	@Override
    public void pay(double amount) {
        System.out.println("Paid via Wallet: " + amount);
    }
}

public class Payments {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();

        p1.pay(500);
        p2.pay(1000);
    }
}
