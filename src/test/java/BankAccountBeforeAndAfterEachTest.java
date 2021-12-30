import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountBeforeAndAfterEachTest {
    static BankAccount bankAccount;

    @BeforeEach
    public void prepTest() {
        System.out.println("Hi!");
        bankAccount = new BankAccount(500, 0);
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(500);
        assertEquals(1000, bankAccount.getBalance());
    }

    @BeforeEach
    public void endTest() {
        System.out.println("Bye!");
    }
}
