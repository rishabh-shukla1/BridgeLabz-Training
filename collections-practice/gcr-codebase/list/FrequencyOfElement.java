package list;
import java.util.*;

public class FrequencyOfElement {
	
	 public static Map<String, Integer> findFrequency(List<String> list) {

	        Map<String, Integer> map = new HashMap<>();

	        for (String s : list) {
	            if (map.containsKey(s)) {
	                map.put(s, map.get(s) + 1);
	            } else {
	                map.put(s, 1);
	            }
	        }

	        return map;
	    }
	
	public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = findFrequency(list);

        for (Map.Entry<String, Integer> entry : result.entrySet()) 
        {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}
