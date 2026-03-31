package exception_handling;

public class BankAccount {
	
	static double balance = 5000;

    static void withdraw(double amount) 
            throws InsufficientBalanceException, IllegalArgumentException {

        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {

        try {
            withdraw(6000);   
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }

}
