package JUnit.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {

    
    @Test
    void testAddition() {
        App app = new App();
        assertEquals(10, app.add(5, 5));
    }
    

}
