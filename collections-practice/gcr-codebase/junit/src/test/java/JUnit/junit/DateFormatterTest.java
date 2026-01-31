package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    @Test
    void testDate() {
        assertEquals("31-01-2024",
            new DateFormatter().formatDate("2024-01-31"));
    }
}

