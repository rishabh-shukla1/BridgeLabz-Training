package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankTesting {
	
	@Test
	void testBank() {
		BankingTransactions b=new BankingTransactions();
		    b.deposit(100);
	        b.withdraw(50);
	        assertEquals(50, b.getBalance());
		
	}
	
	@Test
	void testBank2() {
		
		BankingTransactions b=new BankingTransactions();
		 assertThrows(IllegalArgumentException.class,()->{
			 b.withdraw(100);
		 });

	}
	
	

}
