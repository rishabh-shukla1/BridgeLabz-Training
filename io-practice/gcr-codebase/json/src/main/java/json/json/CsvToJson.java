package json.json;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.*;
import java.util.List;
import java.util.Map;

public class CsvToJson {
	
	 public static void main(String[] args) throws Exception {

	        CsvMapper csvMapper = new CsvMapper();
	        CsvSchema schema = CsvSchema.emptySchema().withHeader();

	        // Read CSV
	        MappingIterator<Map<String,String>> it =
	            csvMapper.readerFor(Map.class)
	                     .with(schema)
	                     .readValues(
	                        new File("student.csv"));

	        List<Map<String,String>> list = it.readAll();

	        // Convert to JSON
	        ObjectMapper jsonMapper = new ObjectMapper();
	        String json = jsonMapper.writeValueAsString(list);

	        System.out.println(json);
	    }

}
