public class BankAccount {
    private double balance;
    private String owner;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive"
            );
        }

        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive!");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds!");
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
