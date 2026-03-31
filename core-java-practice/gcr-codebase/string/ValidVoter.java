package string;
import java.util.*;

public class ValidVoter {
	public static int[] generateAges(int n)
	{
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) 
        {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    //Check voting eligibility
    public static String[][] checkVoting(int[] ages)
    {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) 
        {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) 
            {
                result[i][1] = "false";
            } 
            else if (ages[i] >= 18)
            {
                result[i][1] = "true";
            } 
            else 
            {
                result[i][1] = "false";
            }
        }
        return result;
    }

    //Display result in tabular format
    public static void displayTable(String[][] data) 
    {
        System.out.println("Age Can Vote");
     

        for (int i = 0; i < data.length; i++) 
        {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students:-");
        
        int n = sc.nextInt();

        //  Generate ages
        int[] studentAges = generateAges(n);

        //  Check voting eligibility
        
        String[][] votingStatus = checkVoting(studentAges);

        //  Display result
        
        displayTable(votingStatus);

        sc.close();
    }

}
