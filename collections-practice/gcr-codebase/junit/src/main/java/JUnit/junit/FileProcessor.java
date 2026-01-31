package JUnit.junit;
import java.io.*;

public class FileProcessor {
	
	public void writeToFile(String name, String content) throws IOException{
		FileWriter fr=new FileWriter(name);
		fr.write(content);
		fr.close();
	}
	
	public String readFromFile(String s) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader(s));
		return br.readLine();
		
	}

}
