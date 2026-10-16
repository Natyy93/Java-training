
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testStandardWithdrawal() {
        BankAccount account = new BankAccount("Natia", 500.0);

        account.withdraw(50.0);

        assertEquals(450.0, account.getBalance(), 0.001);
    }

    @Test
    void testOverdrawProtection() {
        BankAccount account = new BankAccount("Natia", 500.0);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(600.0)
        );

        assertEquals(500.0, account.getBalance(), 0.001);
    }

    @Test
    void testNegativeWithdrawal() {
        BankAccount account = new BankAccount("Natia", 500.0);

        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(-50.0)
        );

        assertEquals(500.0, account.getBalance(), 0.001);
    }
}
