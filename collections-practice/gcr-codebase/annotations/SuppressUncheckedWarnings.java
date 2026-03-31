package annotations;
import java.util.*;

public class SuppressUncheckedWarnings {
	
	    @SuppressWarnings("unchecked")
	    public static void main(String[] args) {

	       
	        ArrayList list = new ArrayList();

	        list.add("Hello");
	        list.add(100);   // different type

	        // Casting causes unchecked warning
	        ArrayList<String> stringList = list;

	        for (String s : stringList) {
	            System.out.println(s);
	        }
	    }

}
