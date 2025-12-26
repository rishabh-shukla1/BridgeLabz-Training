package arrays;

import java.util.*;

public class BonusOfZara {
	
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Define Array
        
        double[] salary = new double[10];
        
        double[] year= new double[10];
        
        double[] bonus = new double[10];
        
        double[] newSalary = new double[10];

        // Total Variables
         // Total bonu,old saray,new Salary
        
        double totalB = 0.0;
        double totalOldS = 0.0;
        double totalNewS = 0.0;

        // Taking input
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter details for Employee-:");
            // Employee salary input
            System.out.print("Enter Salary: ");
            salary[i] = kb.nextDouble();
            //Employee year of services
            
            System.out.print("Enter Years of Service: ");
              year[i] = kb.nextDouble();
             
            // Validation check
            if (salary[i] <= 0 || year[i] < 0) 
            {
                System.out.println("Invalid input! Please enter again.");
                
                i--;
                continue;
            }
        }

        // Calculation bonus
        for (int i = 0; i < 10; i++) {

            if (year[i] > 5)
            {    // 5% bonus
                bonus[i] = salary[i] * 0.05;
               
            } 
            else {
            	// 2% bonus
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            // Total
            
            totalB += bonus[i];
            
            totalOldS += salary[i];
            
            totalNewS += newSalary[i];
        }

        // Display
        System.out.println(" Zara Bonus Summary-:");
        
        System.out.println("Total Old Salary  :- " + totalOldS);
        
        System.out.println("Total Bonus Paid  :- " + totalB);
        
        System.out.println("Total New Salary  :- " + totalNewS);
         // Scanner CLose
        
        kb.close();
    }

}
