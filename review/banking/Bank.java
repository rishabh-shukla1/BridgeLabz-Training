package banking;

import java.util.*;

public class Bank implements BankService{

	HashMap<String,Account> h=new HashMap<>();
	
	@Override
	public void createAccount(Account a) {
		// TODO Auto-generated method stub
		h.put(a.getAccountNumber(),a);
		
		System.out.println("account created successfully");
		
	}

	@Override
	public void fundTransfer(String from, String to, int amount) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		
		Account f=h.get(from);
		Account t=h.get(to);
		
		try {
			
			 f.withdraw(amount);
			 t.deposit(amount);
			 
			 System.out.println("Amount tranferred successfully");	
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			
		}
			
		
	}

	@Override
	public double checkBalance(String acc) {
		
		// TODO Auto-generated method stub
	
		Account a=h.get(acc);
		
		System.out.println(a.getBalance());
		
		return a.getBalance();
		
		
	}

}
