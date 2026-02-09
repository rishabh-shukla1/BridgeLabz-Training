package multi_threading;
class BankAccount {
    int balance = 10000;

    public void withdraw(int amount, String customer) {
        System.out.println("[" + customer + "] Attempting to withdraw " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transaction successful: " + customer +
                    ", Amount: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Transaction failed: " + customer +
                    " (Insufficient balance)");
        }
    }
}

class Transaction implements Runnable {
    private BankAccount account;
    private int amount;
    private String customer;

    public Transaction(BankAccount account, int amount, String customer) {
        this.account = account;
        this.amount = amount;
        this.customer = customer;
    }

    @Override
    public void run() {
        account.withdraw(amount, customer);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        int[] amounts = {3000, 4000, 2000, 5000, 1500};

        for (int i = 0; i < amounts.length; i++) {
            Thread t = new Thread(
                    new Transaction(account, amounts[i], "Customer-" + (i + 1)),
                    "Customer-" + (i + 1)
            );
            System.out.println(t.getName() + " State: " + t.getState());
            t.start();
        }
    }
}
