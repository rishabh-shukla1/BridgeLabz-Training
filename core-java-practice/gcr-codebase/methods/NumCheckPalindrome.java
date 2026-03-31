package methods;

import java.util.Scanner;

public class NumCheckPalindrome 
{
	 // method to count digits
    public static int countDigits(int num)
    {
        int c = 0;
        while (num > 0)
        {
            c++;
            num = num / 10;
        }
        return c;
    }

    //method to store digits
    public static int[] getDigits(int num)
    {
        int c = countDigits(num);
        
        int[] digit = new int[c];

        for (int i = c - 1; i >= 0; i--)
        {
            digit[i] = num % 10;
            num = num / 10;
        }
        return digit;
    }

    // method to reverse array
    public static int[] reverseArray(int[] arr)
    {
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];

        return rev;
    }

    // method to compare arrays
    public static boolean compareArrays(int[] a, int[] b)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    // method to check palindrome
    public static boolean isPalindrome(int[] digits)
    {
        int[] rev = reverseArray(digits);
        return compareArrays(digits, rev);
    }

    // method to check duck num
    public static boolean isDuck(int[] digits)
    {
        for (int i = 0; i < digits.length; i++)
        {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
    	Scanner kb=new Scanner(System.in);
    	//User Input
    	
        System.out.println("Enter number-:");
        int num=kb.nextInt();

        // calling method
        int[] digits = getDigits(num);

        // Display
        System.out.println("Palindrome = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuck(digits));
        kb.close();
        
    }
	
	

}
