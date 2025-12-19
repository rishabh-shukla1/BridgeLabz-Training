package leet_code_codebase;
import java.util.*;
public class CelciusToFahrenhite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter temperature in celcius-:");
		Scanner kb=new Scanner(System.in);
		double cel = kb.nextDouble();
		
		// calculation
		
		double fahrenheit = (cel * 9/5) + 32;
		
		System.out.println("Fahrenheit temp-:"+fahrenheit);
		
		kb.close();

	}

}
