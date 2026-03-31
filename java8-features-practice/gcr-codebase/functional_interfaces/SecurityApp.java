package functional_interfaces;

interface Sensitive { }

class BankAccount implements Sensitive {
    String accountNo = "12345";
}

class EncryptionService {
    static void process(Object obj) {

        if (obj instanceof Sensitive) {
            System.out.println("Encrypting data...");
        } else {
            System.out.println("No encryption needed");
        }
    }
}

public class SecurityApp {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        String name = "Rahul";

        EncryptionService.process(acc);
        EncryptionService.process(name);
    }
}
