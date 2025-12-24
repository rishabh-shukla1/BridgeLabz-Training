package methods;

import java.util.Scanner;

public class NumCheckHarshadNumber
{
	 //method to count digits
    public static int countDigits(int number)
    {
        int c = 0;
        while (number > 0)
        {
            c++;
            number = number / 10;
        }
        return c;
    }

    //method to store digits in array
    
    public static int[] getDigits(int number)
    {
        int c=countDigits(number);
        int[]digit = new int[c];

        for (int i = c - 1; i >= 0; i--)
        {
            digit[i] = number % 10;
            number = number / 10;
        }
        return digit;
    }

    //method to find sum of digits
    public static int findSum(int[] digits)
    {
        int sum = 0;

        for (int i = 0; i < digits.length; i++)
        {
            sum = sum + digits[i];
            
        }

        return sum;
    }

    //method to find sum of squares
    public static double findSumOfSquares(int[] digits)
    {
        double sum = 0;

        for (int i = 0; i < digits.length; i++)
        {
            sum = sum + Math.pow(digits[i], 2);
        }

        return sum;
    }

    // method to check Harshad number
    public static boolean isHarshad(int num, int[] d)
    {
        int sum = findSum(d);
        return num % sum == 0;
    }

    // method to find frequency
    public static int[][] findFrequency(int[] digits)
    {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
        {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int i = 0; i < digits.length; i++)
        {
            freq[digits[i]][1]++;
        }

        return freq;
    }

    public static void main(String[] args)
    {
    	Scanner kb=new Scanner(System.in);
        System.out.println("Enter number-:");
        int num=kb.nextInt();

        // calling method
        int[] digits = getDigits(num);

        // Display
        System.out.println("Sum -:" + findSum(digits));
        System.out.println("Sum of Squares -:" + findSumOfSquares(digits));
        System.out.println("Harshad Number -:" + isHarshad(num, digits));

        int[][] freq = findFrequency(digits);
        
        System.out.println("Digit   Frequency");
        for (int i = 0; i < freq.length; i++)
        {
            if (freq[i][1] > 0)
            {
                System.out.println(freq[i][0] + "         " + freq[i][1]);
            }
        }
        kb.close();
    }

}
