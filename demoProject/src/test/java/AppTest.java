
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(30, App.add(20, 10));
    }

    @Test
    public void testSubtraction() {
        assertEquals(10, App.subtract(20, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(200, App.multiply(20, 10));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, App.divide(20, 10));
    }
}
