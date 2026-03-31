package scenario_based.BankingSystem;


public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException(String message)
	{
		
		super(message);	
	}

}
