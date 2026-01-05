package encapsulation_polymorphism;

interface Loanable
{
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount
{
    // Encapsulated fields
    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        setBalance(balance);
    }

    // Getter
    public double getBalance()
    {
        return balance;
    }

    // Setter with validation
    public void setBalance(double balance)
    {
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("Invalid Balance");
    }

    // Deposit method
    public void deposit(double amount)
    {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid Deposit");
    }

    // Withdraw method
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance or invalid amount");
    }

    // Abstract method
    public abstract double calculateInterest();

    public void display()
    {
        System.out.println("Account No :- " + accountNumber);
        System.out.println("Holder    :- " + holderName);
        System.out.println("Balance   :- " + balance);
    }
}
class SavingsAccount extends BankAccount implements Loanable{

	SavingsAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyForLoan(double amount) {
		System.out.println("Loan Applied for ₹" + amount);
		
	}

	@Override
	public double calculateLoanEligibility() {
		// TODO Auto-generated method stub
		return getBalance() * 5;
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return getBalance() * 0.04;
	}
	
}

class CurrentAccount extends BankAccount implements Loanable{

	CurrentAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyForLoan(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Business Loan Applied for ₹" + amount);
		
	}

	@Override
	public double calculateLoanEligibility() {
		// TODO Auto-generated method stub
		return getBalance() * 10;  
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		 return getBalance() * 0.02;   // 2% interest
	}
	
}

public class BankingSystem {
	
	public static void main(String args[]) {
		
		BankAccount b1=new SavingsAccount(101,"Rishabh",500);
		BankAccount b2=new CurrentAccount(102,"raj",1000);
		
		 BankAccount b[]= {b1,b2};
		
		for(BankAccount account:b) {
			
			account.display();
			double interest=account.calculateInterest();
			System.out.println("Interest :-"+interest);
			
			if(account instanceof Loanable) {
				
			     Loanable l=(Loanable)account;
			     System.out.println("Eligiblity	-:"+l.calculateLoanEligibility());
			     System.out.println("======================================");
				
				
			}
			
			
			
		}
		
		
	}

}
