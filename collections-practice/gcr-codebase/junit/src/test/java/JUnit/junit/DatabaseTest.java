package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DatabaseTest {
	
	
	DatabaseConnection db;
	
	@BeforeEach
	void setup() {
		db=new DatabaseConnection();
		
		db.connect();
		
	}
	
	@AfterEach
	void testdisconnect() {
		
		db.disconnect();
	}
	
	@Test
	void cleanup() {
		
		assertTrue(db.connected);
	}

	
}
