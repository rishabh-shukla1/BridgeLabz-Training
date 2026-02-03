package csv_data_handling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SortBySalary {
	
	 public static void main(String[] args) {
	        try {
	            BufferedReader br = new BufferedReader(
	                    new FileReader("src/csv_data_handling/employee.csv"));

	            List<String[]> list = new ArrayList<>();
	            String line = br.readLine();

	            while ((line = br.readLine()) != null) {
	                list.add(line.split(","));
	            }
	            br.close();

	        
	            list.sort((a, b) -> 
	                Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

	            System.out.println("Top 5 Highest Paid Employees:");
	            for (int i = 0; i < 5 && i < list.size(); i++) {
	                String[] emp = list.get(i);
	                System.out.println(emp[1] + " - " + emp[3]);
	            }

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
