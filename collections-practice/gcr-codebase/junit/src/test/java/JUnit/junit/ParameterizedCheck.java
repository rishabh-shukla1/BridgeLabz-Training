package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedCheck {
	
	Parameterized p=new Parameterized();
	
	@ParameterizedTest
	@ValueSource(ints ={2,3,4,9})
	void test(int n) {
		
		assertEquals(n%2==0,p.isEven(n));
		
	}

}
