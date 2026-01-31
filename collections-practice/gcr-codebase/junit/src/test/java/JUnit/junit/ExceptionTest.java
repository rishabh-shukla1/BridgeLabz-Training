package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 5/0;
        });
    }
}

