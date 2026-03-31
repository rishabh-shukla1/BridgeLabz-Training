package control_flow;
import java.util.*;
public class CheckVotePerson {
	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        //Take input from user
        System.out.print("Enter age: ");
        
        int age = kb.nextInt();

        if (age >= 18)
        {
            System.out.println("The person's age is " + age + " and can vote");
        } else
        {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        kb.close();
    }

}
