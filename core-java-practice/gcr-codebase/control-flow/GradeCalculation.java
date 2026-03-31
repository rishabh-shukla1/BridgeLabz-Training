package control_flow;
import java.util.*;
public class GradeCalculation {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Input Physics marks
        
        System.out.print("Enter Physics marks:- ");
        int physics = kb.nextInt();
        
        //Input Marks Chemistry

        System.out.print("Enter Chemistry marks:- ");
        int chemistry =kb.nextInt();
        
        // Input Marks Maths
        
        System.out.print("Enter Maths marks:- ");
        int maths = kb.nextInt();

        // average
        
        double average = (physics + chemistry + maths) / 3.0;

        String grade;
        String remarks;

        // Determine grade and remarks
        if (average >= 80)
        {
        	//above=80
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        }
        
        // less than 80 but greater than 70
        else if (average >= 70) {
            grade = "B";
            
            remarks = "Level 3, at agency-normalized standards";
        } 
        else if (average >= 60) {
        	
            grade = "C";
            
            remarks = "Level 2, below but approaching agency-normalized standards";
        }
        else if (average >= 50) 
        {
            grade = "D";
            
            remarks = "Level 1, well below agency-normalized standards";
        } 
        else if (average >= 40)
        {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
            
        } 
        else {
            grade = "R";
            
            remarks = "Remedial standards";
        }

       
        System.out.println("\nAverage Marks: " + average + "%");
        
        System.out.println("Grade: " + grade);
        
        System.out.println("Remarks: " + remarks);

        kb.close();
    }

}
