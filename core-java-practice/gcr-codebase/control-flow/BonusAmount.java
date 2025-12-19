package control_flow;

import java.util.*;

public class BonusAmount {

	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        // enter basic salary

        System.out.print("Enter employee salary:-");
        
        double salary = kb.nextDouble();
        // enter year of service
        System.out.print("Enter years of service:-");
        
        int years = kb.nextInt();

        double bonus = 0.0;

        // Check eligible or not
        
        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus Amount:-" + bonus);

        kb.close();
    }

}
