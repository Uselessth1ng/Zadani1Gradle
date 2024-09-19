import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApiTest {
    @Test
    void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Tag("smoke")
    void subtraction() {
        assertEquals(2, 3 - 1);
    }
}