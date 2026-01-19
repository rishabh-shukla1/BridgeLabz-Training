package banking;

public class SavingsAccount extends Account{

	SavingsAccount(String accountNumber, String name, int balance) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	double interest() {
		// TODO Auto-generated method stub
		return getBalance()*0.05;
	}

}
