package JUnit.junit;

public class DateFormatter {
	
	public String formatDate(String d) {
        String[] p = d.split("-");
        return p[2]+"-"+p[1]+"-"+p[0];
    }

}
