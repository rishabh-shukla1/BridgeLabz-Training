package methods;

import java.util.Scanner;

public class NumberChecker
{
	//method to count digits
    public static int countDigits(int number)
    {
        int c= 0;

        while (number > 0)
        {
            c++;
            number = number / 10;
        }

        return c;
    }

    // store digits in array
    public static int[] getDigits(int number)
    {
        int c = countDigits(number);
        int[] digit = new int[c];

        for (int i = c- 1; i >= 0; i--)
        {
            digit[i] = number % 10;
            number = number / 10;
        }

        return digit;
    }

    // method to check duck number
    public static boolean isDuckNumber(int[] digit)
    {
        for (int i = 0; i < digit.length; i++)
        {
            if (digit[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // method to check armstrong number
    public static boolean isArmstrong(int number, int[] d)
    {
        int sum = 0;
        int power = d.length;

        for (int i = 0; i < d.length; i++)
        {
            sum = sum + (int)Math.pow(d[i], power);
        }

        return sum == number;
    }

    //find largest and second largest
    public static void findLargest(int[] digit)
    {
        int larg = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int i = 0; i < digit.length; i++)
        {
            if (digit[i] > larg)
            {
                sec= larg;
                larg = digit[i];
            }
            else if (digit[i] > sec && digit[i] != larg)
            {
                sec = digit[i];
            }
        }

        System.out.println("Largest digit = " + larg);
        System.out.println("Second largest digit = " + sec);
    }

    // method to find smallest and second smallest
    public static void findSmallest(int[] d)
    {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < d.length; i++)
        {
            if (d[i] < smallest)
            {
                second = smallest;
                smallest = d[i];
            }
            else if (d[i] < second && d[i] != smallest)
            {
                second = d[i];
            }
        }

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Second smallest digit = " + second);
    }

    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number-:");
        int num=kb.nextInt();

        // calling method
        int[] digits = getDigits(num);

        // Display
        System.out.println("Duck Number -: " +isDuckNumber(digits));
        System.out.println("Armstrong Number -:" +isArmstrong(num, digits));

        findLargest(digits);
        findSmallest(digits);
        
        kb.close();
    }

}
