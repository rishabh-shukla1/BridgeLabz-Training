package json.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.*;


public class FilterJsonFromFile {
	
	  public static void main(String[] args) throws Exception {

	        
	        ObjectMapper mapper = new ObjectMapper();

	       
	        JsonNode root = mapper.readTree(
	                new File("people.json"));

	      
	        ArrayNode array = (ArrayNode) root;

	        
	        for (JsonNode node : array) {
	            if (node.get("age").asInt() > 25) {
	                System.out.println(node.toPrettyString());
	            }
	        }
	    }

}
