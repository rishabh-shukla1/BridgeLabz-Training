package stringbuffer_stringbuilder_linear_binarysearch;

public class ConcatenateStrings {
	
	public static void main(String args[]) {
		
		String s[]= {"hello","My","Name" ,"is","Rishabh"};
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length;i++)
		{
			String t=s[i];
			
			sb.append(t).append(" ");
		}
		
		System.out.print(sb.toString());
	}

}
