package inheritance;


class BankAccount
{
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

//Savings Account

class SavingsAccount extends BankAccount
{
    double interestRate;

    SavingsAccount(String acc, double bal, double interestRate)
    {
        super(acc, bal);
        this.interestRate = interestRate;
    }

    void displayAccountType()
    {
        System.out.println("Account Type: Savings Account");
    }
}

// Checking Account
class CheckingAccount extends BankAccount
{
    int withdrawalLimit;

    CheckingAccount(String acc, double bal, int limit)
    {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }

    void displayAccountType()
    {
        System.out.println("Account Type: Checking Account");
    }
}

//Fixed Deposit Account
class FixedDepositAccount extends BankAccount
{
    int lockPeriod;

    FixedDepositAccount(String acc, double bal, int lockPeriod)
    {
        super(acc, bal);
        this.lockPeriod = lockPeriod;
    }

    void displayAccountType()
    {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

// Main class
public class BankSystem
{
    public static void main(String[] args)
    {
        SavingsAccount s = new SavingsAccount("SA101", 5000, 4.5);
        CheckingAccount c = new CheckingAccount("CA102", 8000, 5);
        FixedDepositAccount f = new FixedDepositAccount("FD103", 20000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
