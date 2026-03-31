package functional_interfaces;
import java.io.*;

class Employee implements Serializable  {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class BackupSystem {
	
    public static void main(String[] args) throws Exception {

        Employee emp = new Employee(1, "Rahul");

        FileOutputStream file =new FileOutputStream("emp.dat");
        ObjectOutputStream out =new ObjectOutputStream(file);

        out.writeObject(emp); 
        out.close();

        System.out.println("Backup created");
    }
}

