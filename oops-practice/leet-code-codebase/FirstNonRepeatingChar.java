package leet_code_codebase;
import java.util.*;

public class FirstNonRepeatingChar 
{
	public static void main(String args[]) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter String:-");
		String s=kb.nextLine();
		s=s.toLowerCase();
		
		
		int a[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='a' && ch<='z')
			a[ch-'a']++;
		}
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='a'&& ch<='z' && a[ch-'a']==1)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
		
		kb.close();
		
	}

}
