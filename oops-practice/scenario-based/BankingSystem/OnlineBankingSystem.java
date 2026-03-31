package scenario_based.BankingSystem;

public class OnlineBankingSystem {
	public static void main(String[] args)
    {
        Bank bank = new Bank();

        Account a1 = new SavingAccount("Rishabh", 10000, "A101");
        Account a2 = new CurrentAccount("Aman", 5000, "A102");

        bank.createAccount(a1);
        bank.createAccount(a2);

        // Thread 1
        Thread t1 = new Thread(() -> {
            try {
				bank.FundTransfer("A101", "A102", 3000);
				System.out.println("Rishabh Balance: " + bank.BalanceCheck("A101"));
		        System.out.println("Aman Balance: " + bank.BalanceCheck("A102"));
		        System.out.println("----------");
			} catch (InsufficientBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            try {
				bank.FundTransfer("A101", "A102", 4000);
				System.out.println("Rishabh Balance: " + bank.BalanceCheck("A101"));
		        System.out.println("Aman Balance: " + bank.BalanceCheck("A102"));
		        System.out.println("----------");
			} catch (InsufficientBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });

        t1.start();
        t2.start();

        System.out.println("Rishabh Balance: " + bank.BalanceCheck("A101"));
        System.out.println("Aman Balance: " + bank.BalanceCheck("A102"));
        System.out.println("---------------");
        
        
        
    }

}
