package Regex;

public class HexColorCode {
	
	public static void main(String args[]){
		
	
		 String regex="^#[0-9A-Fa-f]{6}";
		 
		 String[] colors = {
		            "#FFA500",
		            "#ff4500",
		            "#123",
		            "123456",
		            "#GGGGGG"
		        };

		        for (String color : colors) {
		            if (color.matches(regex)) {
		                System.out.println(color + "-: Valid");
		            } else {
		                System.out.println(color + "-: Invalid");
		            }
		        }
		    }
		 
		
}


