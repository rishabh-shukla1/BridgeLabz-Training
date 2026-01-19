package banking;

public interface BankService {
	
	void createAccount(Account a);
	void fundTransfer(String from,String to,int amount) throws InsufficientBalanceException;
	double checkBalance(String acc);

}
