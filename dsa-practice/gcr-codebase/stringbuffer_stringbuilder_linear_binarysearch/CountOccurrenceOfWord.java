package stringbuffer_stringbuilder_linear_binarysearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrenceOfWord {
	
	public static void main(String args[]) throws IOException
	{
		
		
				
		FileReader fr=new FileReader("src/stringbuffer_stringbuilder_linear_binarysearch/example.txt"); 
		BufferedReader br=new BufferedReader(fr);
		String word="hello";
		int count=0;
		
		while(true){
			
			String line=br.readLine();
			
			if(line == null)
			{
				break;
			}
			
			String s[]=line.split("\\s+");
			for(int i=0;i<s.length;i++)
			{
				if(s[i].equalsIgnoreCase(word))
				{
					count++;
				}
				
			}
	
		}
		br.close();
		fr.close();
		
		
		System.out.println("Count	:-"+count);

}
}
