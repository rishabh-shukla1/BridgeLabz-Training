package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    void testPassword() {
        assertTrue(new PasswordCheck().isValid("Hello123"));
    }
}
