package csv_data_handling;

import java.io.*;

public class UpdateSalary {
	
	public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/csv_data_handling/employee.csv"));
            
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("src/csv_data_handling/updatedemployees.csv"));

            String line = br.readLine();
            bw.write(line); // header
            bw.newLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(data[3]);
                    salary = salary * 1.10; 
                    data[3] = String.valueOf((int) salary);
                }

                bw.write(String.join(",", data));
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Updated file created.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
