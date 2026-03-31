package csv_data_handling;

import java.io.*;

public class SearchEmployee {
	
	public static void main(String[] args) {
        String searchName = "Priya";

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/csv_data_handling/employee.csv"));

            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(",");

                if (data[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary    : " + data[3]);
                    break;
                }
            }
            br.close();
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
