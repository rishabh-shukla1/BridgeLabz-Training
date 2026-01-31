package JUnit.junit;

public class BankingTransactions {

	    double balance;

	    public void deposit(double amt) {
	        balance += amt;
	    }

	    public void withdraw(double amt) {
	        if (amt > balance)
	            throw new IllegalArgumentException();
	        balance -= amt;
	    }

	    public double getBalance() {
	        return balance;
	    }
	
}
