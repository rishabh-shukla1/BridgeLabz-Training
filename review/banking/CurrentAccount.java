package banking;

public class CurrentAccount extends Account{

	CurrentAccount(String accountNumber, String name, int balance) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	double interest() {
		// TODO Auto-generated method stub
		return  0.1* getBalance();
	}

}
