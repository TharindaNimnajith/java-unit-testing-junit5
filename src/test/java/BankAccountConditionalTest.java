import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class BankAccountConditionalTest {
    @SuppressWarnings("EmptyMethod")
    @Test
    @EnabledOnOs({OS.MAC})
    public void testMac() {
    }

    @SuppressWarnings("EmptyMethod")
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testWindows() {
    }

    @SuppressWarnings("EmptyMethod")
    @Test
    @EnabledOnJre({JRE.JAVA_16})
    public void testJRE() {
    }

    @SuppressWarnings("EmptyMethod")
    @Test
    @DisabledOnJre({JRE.JAVA_16})
    public void testNoJRE16() {
    }
}
