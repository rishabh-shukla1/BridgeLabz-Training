package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void testInvalidUser() {
        assertThrows(IllegalArgumentException.class,
            () -> new UserRegistration().registerUser("","a","b"));
    }
}

