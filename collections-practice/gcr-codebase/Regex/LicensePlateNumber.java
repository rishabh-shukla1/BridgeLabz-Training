package Regex;

public class LicensePlateNumber {
	
	public static void main(String args[]) {
		
		
		String regex="^[A-Z]{2}[0-9]{4}";
		
		
		String[] plates = {
	            "AB1234",
	            "A12345",
	            "ab1234",
	            "XY9876"
	        };

	        for (String plate : plates) {
	            if (plate.matches(regex)) {
	                System.out.println(plate + "-: Valid");
	            } else {
	                System.out.println(plate + "-: Invalid");
	            }
	        }
	    }

}
