package Regex;

public class ValidateIP {
	
	 public static void main(String[] args) {

	        String ip = "192.168.1.1";
	        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}$";

	        System.out.println(ip.matches(regex));
	    }

}
