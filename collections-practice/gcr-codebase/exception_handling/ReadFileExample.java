package exception_handling;


import java.io.*;

public class ReadFileExample {
	
	public static void main(String args[]) throws IOException{
		
		
		try {
		File file =new File("data.txt");
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		while(true) {
			
			String line = br.readLine();
			if(line==null) {
				break;
			}
			
			System.out.println(line);
		}
		
		br.close();
		
		}
		
		catch(IOException e) {
			
			System.out.println(e.getMessage());
			
			
		}
		
		
	}

}
