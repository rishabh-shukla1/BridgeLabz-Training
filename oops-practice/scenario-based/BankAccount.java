package scenario_based;

import java.util.*;

public class BankAccount 
{
	//Fields
    private String accountNumber;
    private double balance;
    
    BankAccount(String accountNumber, double balance){
    	
    	this.accountNumber=accountNumber;
    	this.balance=balance;
    }
    
    // Deposit method
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance = balance + amount;
            System.out.println("Amount Deposited : " + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }
    // Withdraw deposit
    public void withdraw(double amount)
    {
        if (amount > 0)
        {
            if (amount <= balance)
            {
                balance = balance - amount;
                System.out.println("Amount Withdrawn : " + amount);
            }
            else
            {
                System.out.println("Insufficient Balance! Withdrawal denied.");
            }
        }
        else
        {
            System.out.println("Invalid withdrawal amount");
        }
    }
    // Method to check balance
    public void checkBalance()
    {
        System.out.println("Current Balance : " + balance);
    }
    
    //Main method
    
    public static void main(String args[])
    {
    	
    	Scanner kb=new Scanner(System.in);
    	
    	//Creating account
        BankAccount account = new BankAccount("ewrywieuerw",1000);
        int choice;
        
        do
        {
            System.out.println(" Bank-------:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice : ");
            choice = kb.nextInt();

            if (choice == 1)
            {
                System.out.print("Enter amount to deposit -:");
                double a = kb.nextDouble();
                account.deposit(a);
            }
            else if (choice == 2)
            {
                System.out.print("Enter amount to withdraw -:");
                double a= kb.nextDouble();
                account.withdraw(a);
            }
            else if (choice == 3)
            {
                account.checkBalance();
            }

        } while (choice != 4);

        kb.close();
    	
    }


}
