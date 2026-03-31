package Regex;

public class ValidateCard {
	
	 public static void main(String[] args) {

	        String card = "4123456789012345";
	        String visa = "^4\\d{15}$";
	        String master = "^5\\d{15}$";

	        if (card.matches(visa))
	            System.out.println("Visa");
	        else if (card.matches(master))
	            System.out.println("MasterCard");
	        else
	            System.out.println("Invalid");
	    }

}
