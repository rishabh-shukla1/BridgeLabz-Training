package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListManagerTest {

    ListManager manager = new ListManager();

    @Test
    void testAdd() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 5);
        assertEquals(1, manager.getSize(list));
    }
}

