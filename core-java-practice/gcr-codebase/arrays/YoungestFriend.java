package array;

import java.util.*;

public class YoungestFriend {
	
	public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);

        // Arrays of friend
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Define Array store age and height
        int[] age = new int[3];
        
        double[] height = new double[3];

        // User Input
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter details for-:"+ names[i]);

            System.out.print("Age:-");
            
            age[i] = kb.nextInt();

            System.out.print("Height:-");
            
            height[i] = kb.nextDouble();
        }

        
        int youngInd = 0;
        int tallInd = 0;

        // Find youngest and tallest
        
        for (int i = 1; i < 3; i++)
        {
            if (age[i] < age[youngInd]) 
            {
                youngInd = i;
            }

            if (height[i] > height[tallInd])
            {
                tallInd = i;
            }
        }

        // Display answer
     
        System.out.println("Youngest Friend:-" + names[youngInd] +
                " Age:-" + age[youngInd] );

        System.out.println("Tallest Friend  :- " + names[tallInd] +
                "  Height:- " + height[tallInd]);
        
       // Scanner Close
        kb.close();
    }

}
