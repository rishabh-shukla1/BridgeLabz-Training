package csv_data_handling;

import java.io.*;

public class WriteCSVFile {

	    public static void main(String[] args) {

	        try {
	            FileWriter fw = new FileWriter("src/csv_data_handling/employee.csv");
	            BufferedWriter bw = new BufferedWriter(fw);

	         
	            bw.write("ID,Name,Department,Salary");
	            bw.newLine();

	           
	            bw.write("1,Rahul,IT,50000");
	            bw.newLine();

	            bw.write("2,Anita,HR,45000");
	            bw.newLine();

	            bw.write("3,Rohan,Finance,55000");
	            bw.newLine();

	            bw.write("4,Priya,Marketing,48000");
	            bw.newLine();

	            bw.write("5,Amit,Sales,47000");
	            bw.newLine();

	            bw.close();
	            fw.close();

	            System.out.println("CSV file created and data written successfully.");

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
