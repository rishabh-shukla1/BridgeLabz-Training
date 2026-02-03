package csv_data_handling;

import java.io.*;

public class FilterStudents {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/csv_data_handling/student.csv"));

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int marks = Integer.parseInt(data[3]);

                if (marks >200) {
                    System.out.println(line);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
