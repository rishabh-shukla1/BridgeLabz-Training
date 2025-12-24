package methods;

import java.util.*;

public class VoteCheck 
{
	public static void main(String[] args) {

        //Open Scanner
        Scanner kb = new Scanner(System.in);

        //define array to store ages of 10 students
        int[] age = new int[10];

        //age input
        for (int i = 0; i < age.length; i++)
        {
            System.out.print("Enter age of student " + (i + 1) + " :-- ");
            age[i] = kb.nextInt();

            //calling method
            
            boolean result = canStudentVote(age[i]);

            // Display
            
            if (result)
            {
                System.out.println("Student can vote");
            }
            else 
            {
                System.out.println("Student cannot vote");
            }
            
        }

        //Scanner closed
        kb.close();
    }

    //method to check voting eligibility
	
    public static boolean canStudentVote(int age)
    {
        if (age< 0) {
            return false;
        }

        if (age>= 18) {
            return true;
        }

        return false;
    }

}
