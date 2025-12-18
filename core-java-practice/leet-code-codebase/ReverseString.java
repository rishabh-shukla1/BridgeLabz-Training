package leet_code_codebase;
import java.util.*;
public class ReverseString {
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the String-:");
		
		String s=kb.nextLine();
		
		String ans="";
		
		for(int i=0;i<s.length();i++)
		{
			ans=s.charAt(i)+ans;
			
		}
		
		System.out.println("Reverser string-:"+ans);
		kb.close();
		
	}

}
