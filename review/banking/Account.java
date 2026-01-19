package banking;

 abstract  class Account {
	 
	  private String accountNumber;
	  private String name;
	  private int balance;
	  
	  Account(String accountNumber, String name, int balance) {
	
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	  }

	  public String getAccountNumber() {
		  return accountNumber;
	  }

	  public String getName() {
		  return name;
	  }

	  

	  public int getBalance() {
		  return balance;
	  }

	  public void setBalance(int balance) {
		  this.balance = balance;
	  }
	  
	  
	  abstract  double interest();
	  
	  public void deposit(int amount){
		  
		  
		  if(amount>0)
		  {
		  balance=balance+amount;
		  
		  System.out.println("Balanace credited"+balance);
		  }
		  else {
			  
			  System.out.println("Error: please check again the amount entered");
		  }
		  
		  
	  }
	  
	  public synchronized void withdraw(int amount) throws InsufficientBalanceException{
		  
		  if(amount>balance)
		  {
			  throw new InsufficientBalanceException("Insufficient Amount");
		  }
		  else {
			  
			  balance=balance-amount;
			  
			  System.out.println("Withdraw Successfull");
		  }
		  
	  }
	  

}
