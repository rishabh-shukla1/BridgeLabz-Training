package JUnit.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.*;

public class FileProcessorTest {
	
	@Test
	void test() throws IOException {	
		FileProcessor f=new FileProcessor();
		
		f.writeToFile("data.txt", "Hello");
	    assertEquals("Hello",f.readFromFile("data.txt"));
		
	}
	

}
