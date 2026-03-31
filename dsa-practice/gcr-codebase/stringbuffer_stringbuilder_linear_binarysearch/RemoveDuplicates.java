package stringbuffer_stringbuilder_linear_binarysearch;

import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void main(String args[]) {
		
		String s="hellohello";
		
		StringBuilder sb=new StringBuilder();
		
		HashSet<Character> h=new HashSet<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!h.contains(ch)) {
				sb.append(ch);
				h.add(ch);
				
			}
		}
		
		
		System.out.println(sb.toString());
		
		
	}

}
