package programming_elements;

import java.util.*;

public class NumberHandshake {
	public static void main(String[] args) {

       
        Scanner kb = new Scanner(System.in);

        // input no of student
        System.out.print("Enter number of students:- ");
        
        int numberOfStudents = kb.nextInt();

        //calculation using formula
        
        int maxHand = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is-: " + maxHand);

      
        kb.close();
    }

}
