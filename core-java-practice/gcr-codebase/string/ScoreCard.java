package string;
import java.util.*;
public class ScoreCard {
	
	 public static int[][] generatePCMScores(int n) {
	        int[][] scores = new int[n][3];

	        for (int i = 0; i < n; i++)
	        {
	            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics   MARKS
	            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry MARKS
	            scores[i][2] = (int) (Math.random() * 90) + 10; // Maths MARKS
	        }
	        
	        return scores;
	    }

	    // Calculate total, average, and percentage
	 
	    public static double[][] calculateResults(int[][] scores)
	    {
	        double[][] result = new double[scores.length][3];

	        for (int i = 0; i < scores.length; i++) 
	        {
	            int total = scores[i][0] + scores[i][1] + scores[i][2];
	            
	            double average = total / 3.0;
	            
	            double percentage = (total / 300.0) * 100;

	            result[i][0] = total;
	            result[i][1] = Math.round(average * 100.0) / 100.0;
	            result[i][2] = Math.round(percentage * 100.0) / 100.0;
	        }
	        return result;
	    }

	    // Calculate grade based on percentage
	    public static String[] calculateGrades(double[][] results)
	    {
	        String[] grades = new String[results.length];

	        for (int i = 0; i < results.length; i++)
	        {
	            double percent = results[i][2];

	            if (percent >= 80)
	                grades[i] = "A";
	            else if (percent >= 70)
	                grades[i] = "B";
	            else if (percent >= 60)
	                grades[i] = "C";
	            else if (percent >= 50)
	                grades[i] = "D";
	            else if (percent >= 40)
	                grades[i] = "E";
	            else
	                grades[i] = "R";
	            
	        }
	        return grades;
	    }

	    //Display scorecard
	    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {

	        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
	       
	        for (int i = 0; i < scores.length; i++) {
	            System.out.println(
	                    (i + 1) + "\t" +scores[i][0] + "\t" +scores[i][1] + "\t\t" +
						                    scores[i][2] + "\t" +
								                    (int) results[i][0] + "\t" +
										                    results[i][1] + "\t" +
												                    results[i][2] + "%\t\t" +
												                    grades[i]

						                    						                    
	            );
	        }
	    }

	    // Main Method
	    public static void main(String[] args)
	    {

	        Scanner kb = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int n = kb.nextInt();

	        int[][] pcmScores = generatePCMScores(n);
	        
	        double[][] results = calculateResults(pcmScores)
	        		;
	        String[] grades = calculateGrades(results);

	        displayScoreCard(pcmScores, results, grades);

	        kb.close();
	    }

}
