package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureTest {
    @Test
    void testTemp() {
        assertEquals(32, new TemperatureConverter().cToF(0));
    }
}
