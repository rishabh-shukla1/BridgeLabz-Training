package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
    }
}

