package class_and_object;

public class BankAccount
{
	    String accountHolder;
	    String accountNumber;
	    double balance;

	    //method to deposit money
	    public void deposit(double amount)
	    {
	        balance = balance + amount;
	        System.out.println("Deposited:-" + amount);
	    }

	    //method to withdraw money
	    public void withdraw(double amount)
	    {
	        if (balance >= amount)
	        {
	            balance = balance - amount;
	            System.out.println("Withdraw amount is :-" + amount);
	        }
	        else
	        {
	            System.out.println("Insufficient balance");
	        }
	    }

	    //method to display balance
	    public void displayBalance()
	    {
	        System.out.println("Current balance:-" + balance);
	    }

	    public static void main(String[] args)
	    {
	        BankAccount b = new BankAccount();
	        b.accountHolder = "State of Chennai";
	        b.accountNumber = "ACC1001";
	        b.balance = 700;

	        System.out.println(b.accountHolder);
	        b.displayBalance();
	        b.deposit(200);
	        b.displayBalance();
	        b.withdraw(100);
	        b.displayBalance();
	        b.withdraw(1000);
	    }

}
