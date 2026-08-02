import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Main;

public class MainTets {

    @Test
    void testMultiply() {
        Main main = new Main();
        Assertions.assertEquals(6, main.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void testDivide() {
        Main main = new Main();
        Assertions.assertEquals(2, main.divide(6, 3), "6 / 3 should equal 2");
    }

    @Test
    void testDivideAgain() {
        Main main = new Main();
        Assertions.assertEquals(1, main.divide(6, 6), "6 / 6 should equal 1");
    }

}
