package csv_data_handling;

import java.io.*;

public class CountCSVRows {
	
	 public static void main(String[] args) {

	        try {
	            BufferedReader br = new BufferedReader(
	                    new FileReader("src/csv_data_handling/employees.csv"));

	            String line;
	            int count = 0;

	          
	            br.readLine();

	            while ((line = br.readLine()) != null) {
	                if (!line.trim().isEmpty()) { 
	                    count++;
	                }
	            }

	            br.close();

	            System.out.println("Total number of records: " + count);

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
