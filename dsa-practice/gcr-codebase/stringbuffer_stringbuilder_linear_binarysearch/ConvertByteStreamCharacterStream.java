package stringbuffer_stringbuilder_linear_binarysearch;

import java.io.*;

public class ConvertByteStreamCharacterStream {
	
	public static void main(String args[]) throws IOException
	{
		String file="src/stringbuffer_stringbuilder_linear_binarysearch/example.txt";
		//Read binary data 
		FileInputStream  f=new FileInputStream (file);
		//Convert byte stream to character stream (UTF-8)
		InputStreamReader isr=new InputStreamReader(f,"UTF-8");
		
		BufferedReader br =new BufferedReader(isr);
		
		while(true) {
			
			String l=br.readLine();
			if(l==null)
			{
				break;
			}
			
			System.out.println(l);
		}
		
		f.close();
		isr.close();
	}

}
