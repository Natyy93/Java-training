
public class main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Natia", 500.0);

        account.deposit(100.0);

        System.out.println(account.getBalance());
    }
}

