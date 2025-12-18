package programming_elements;

import java.util.*;

public class IntOperations {
	
	public static void main(String[] args) {

        
        Scanner kb = new Scanner(System.in);

        //first input
        System.out.println("Enter value of a:- ");
        
        int a = kb.nextInt();
        
        // second input
        System.out.println("Enter value of b:- ");
        
        int b = kb.nextInt();
        
        // third input
        System.out.println("Enter value of c: ");
        int c = kb.nextInt();

       //calcultaion
        int r1 = a + b * c;
        
        int r2 = a * b + c;  
        
        int r3 = c + a / b;  
        
        int r4 = a % b + c;    
        
        System.out.println("The results of Int Operations are " +r1 + ", " + r2 + ", " + r3 + ", and " + r4);

        kb.close();
    }

}
