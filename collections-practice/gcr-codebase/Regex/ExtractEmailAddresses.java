package Regex;


import java.util.regex.*;


public class ExtractEmailAddresses {
	
	public static void main(String args[]) {
		
		String text = "Contact us at support@example.com and info@company.org";
		
		String regex="[A-Za-z0-9_.%+-]+@[A-Za-z0-9]+\\.[A-Za-z]{2,}";
		
		Pattern p=Pattern.compile(regex);//convert into machine readable format
		Matcher m=p.matcher(text);// attach the rule to the text
		
		
		while(m.find()) {
			
			System.out.println(m.group());
		}
		
		
	}

}
