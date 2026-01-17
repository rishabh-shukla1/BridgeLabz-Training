package stringbuffer_stringbuilder_linear_binarysearch;
import java.io.*;
public class ReadUserInputAndWriteToFile {
	
	public static void main(String args[]) throws IOException {
		
		
		String file="stringbuffer_stringbuilder_linear_binarysearch/example2.txt";
		
		InputStreamReader isr=new InputStreamReader(System.in);
		
		BufferedReader br =new BufferedReader(isr);
		
		FileWriter fr=new FileWriter(file);
		
		while(true) {
			
			 String l = br.readLine();

	            // stop on "exit"
	            if (l.equalsIgnoreCase("exit")) {
	                break;
	            }

	           // write input to file
	            fr.write(l);
	            fr.write("\n");

	           
	            System.out.println(l);
		}
		
	    br.close();
	    isr.close();
	    fr.close();
		
	}

}
