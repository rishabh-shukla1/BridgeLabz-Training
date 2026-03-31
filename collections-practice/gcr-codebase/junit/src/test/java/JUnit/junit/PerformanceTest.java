package JUnit.junit;

import org.junit.jupiter.api.*;

public class PerformanceTest {
	
	PerformanceTesting p=new PerformanceTesting();
	
	@Test
	@Timeout(2)
	void test() throws InterruptedException {
		p.longRunningTask();
	}
	
	

}
