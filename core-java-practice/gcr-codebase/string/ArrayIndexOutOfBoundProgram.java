package string;

import java.util.*;

public class ArrayIndexOutOfBoundProgram 
{
	static void generateException(String[] names)
	{
        System.out.println("Generating Exception-:");
       
        System.out.println(names[names.length]);
    }

   
    static void handleException(String[] names)
    {
        System.out.println("Handling Exception-:");
        try
        {
           
            System.out.println(names[names.length]);
            
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("ArrayIndexOutOfBoundsException Caught:-" + e);
        } 
        catch (RuntimeException e) 
        {
            System.out.println("RuntimeException Caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //user Input
        System.out.print("Enter number-:");
        int n = kb.nextInt();
       
        // Declaring array
        String[] names = new String[n];

        // Taking names input
        System.out.print("Enter " +n+ " name:- ");
        for (int i = 0; i < n; i++)
        {
         
            names[i] = kb.nextLine();
        }

//        // First call: generates exception
//        generateException(names);

        // Second call: handles exception
        handleException(names);

        kb.close();
    }

}
