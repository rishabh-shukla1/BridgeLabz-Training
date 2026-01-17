package stringbuffer_stringbuilder_linear_binarysearch;

import java.io.*;

public class ReadFileLineByLine {
	
	public static void main(String args[]) throws IOException
	{
		
		
				
		FileReader fr=new FileReader("src/stringbuffer_stringbuilder_linear_binarysearch/example.txt"); 
		BufferedReader br=new BufferedReader(fr);
		
		String l;
		while((l=br.readLine())!=null)
		{
			System.out.println(l);
		}
		
		br.close();
		fr.close();
		
		
		
	}
	

}
