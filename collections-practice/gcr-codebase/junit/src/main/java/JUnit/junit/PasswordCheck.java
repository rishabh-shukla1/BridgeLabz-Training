package JUnit.junit;

public class PasswordCheck {
	
	 public boolean isValid(String p) {
	        return p.length()>=8 &&
	               p.matches(".*[A-Z].*") &&
	               p.matches(".*\\d.*");
	    }

}
