package json.json;

import java.io.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {
	
	 public static void main(String[] args) throws Exception {

	        // JSON engine
	        ObjectMapper jsonMapper = new ObjectMapper();

	        // Read JSON file
	        JsonNode node = jsonMapper.readTree(
	                new File("user.json"));

	        // XML engine
	        XmlMapper xmlMapper = new XmlMapper();

	        //Convert JSON → XML
	        String xml = xmlMapper.writeValueAsString(node);

	        System.out.println(xml);
	    }

}
