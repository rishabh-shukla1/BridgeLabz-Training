package stringbuffer_stringbuilder_linear_binarysearch;

public class ReverseString {
	
	public  static void main(String args[]) {
		
		String s="Rishabh";
		
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		
		sb.reverse();
		
		System.out.println(sb.toString());
		}

}
