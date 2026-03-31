package json.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

public class ReadJsonFields {
	public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(new File("user.json"));

        System.out.println("Name  : " + node.get("name").asText());
        System.out.println("Email : " + node.get("email").asText());
    }
}

