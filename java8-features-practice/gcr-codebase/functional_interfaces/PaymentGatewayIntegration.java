package functional_interfaces;

interface PaymentProcessor {
    void pay(double amount);

   
    default void refund(double amount) {
        System.out.println("Refund processed: " + amount);
    }
}

class UPi implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class Card implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid via Card: " + amount);
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor p = new UPi();
        p.pay(500);
        p.refund(200);
    }
}

