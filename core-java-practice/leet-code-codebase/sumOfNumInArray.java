package leet_code_codebase;
import java.util.*;
public class sumOfNumInArray {
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		
		System.out.println("Enter 5 Number in array");
		int a[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			a[i]=kb.nextInt();
			
			
		}
		int sum=0;
		
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		
		
		System.out.println(sum);
		
		kb.close();
	}

}
