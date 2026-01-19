package banking;

public class MainBankingSystem {
	
	public static void main(String args[]) throws InsufficientBalanceException
	{
		
		Account a1=new CurrentAccount("12345","rishabh",1000);
		Account a2=new SavingsAccount("54321","ram",2000);
	    
		Bank b=new Bank();
		b.createAccount(a1);
		b.createAccount(a2);
		
		b.checkBalance("12345");
		b.checkBalance("54321");
		b.fundTransfer("12345", "54321", 100);
		
		
		a2.deposit(1000);
		
		try {
		a1.withdraw(10000);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		

		
		
	
		
		
	
	
	}

}
