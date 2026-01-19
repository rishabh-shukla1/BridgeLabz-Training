package review;

public class overload {
	
	public static void main(String agrs[])
	{
		
		System.out.println(sum(5,3));
		System.out.println(sum(5,5,5));
		
	}
	
	public static int  sum(int a, int b)
	{
		return a+b;
	}
	
	public static int sum(int a , int b , int c)
	{
		return a+b+c;
	}

}
