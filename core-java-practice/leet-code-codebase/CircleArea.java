package leet_code_codebase;

import java.util.*;
public class CircleArea {
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		
		System.out.println("Enter the radius-:");
		int r=kb.nextInt();
		
		double area=Math.PI* r * r;
		
		System.out.println("Area of circle-:"+area);
		
		kb.close();
		
	}

}
