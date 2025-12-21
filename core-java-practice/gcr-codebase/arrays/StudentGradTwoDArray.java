package array;

import java.util.*;

public class StudentGradTwoDArray {
	public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);

        //User Input
        System.out.print("Enter number of students:- ");
        int n = kb.nextInt();

        
        int[][] mark= new int[n][3];

         //Define array
        double[] percentage = new double[n];
        
        String[] grade = new String[n];
        
        String[] remark= new String[n];

        // Input mark
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));
            //Physics user input
            System.out.print("Physics:-");
            mark[i][0] = kb.nextInt();
            // Chemistry User Input
            System.out.print("Chemistry:-");
            mark[i][1] = kb.nextInt();
            //Maths user input
            System.out.print("Maths:-");
            mark[i][2] = kb.nextInt();

            // Valid
            if (mark[i][0] < 0 || mark[i][1] < 0 || mark[i][2] < 0) 
            {
                System.out.println("Invalid marks!  enter positive values.");
                i--; 
            }
        }

        // Calculate percentage, grade and remarks
        for (int i = 0; i < n; i++) {

            int total = mark[i][0] + mark[i][1] + mark[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i]>= 80) 
            {
                grade[i] = "A";
                remark[i] = "Level 4, above agency-normalized standards";
            }
            else if (percentage[i]>= 70)
            {
                grade[i] = "B";
                remark[i] = "Level 3, at agency-normalized standards";
            }
            else if (percentage[i]>= 60)
            {
                grade[i] = "C";
                remark[i] = "Level 2, below but approaching standards";
            }
            else if (percentage[i]>= 50) {
                grade[i] = "D";
                remark[i] = "Level 1, well below agency-normalized standards";
            }
            else if (percentage[i] >= 40) {
                grade[i] = "E";
                remark[i] = "Level 1-, too below agency-normalized standards";
            }
            else {
                grade[i] = "R";
                remark[i] = "Remedial standards";
            }
        }

        // Display 
        System.out.println(" Student Result-->");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Student " + (i + 1)+".");
            
            System.out.println("Physics   :- " + mark[i][0]);
            System.out.println("Chemistry :- " + mark[i][1]);
            System.out.println("Maths     :-" + mark[i][2]);
            System.out.println("Percentage:- " + percentage[i]);
            System.out.println("Grade     :- " + grade[i]);
            System.out.println("Remarks   :- " + remark[i]);
            System.out.println();
        }
         //Close Scanner
        kb.close();
    }

}
