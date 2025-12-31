package class_and_object;

public class Employee
{
	    String name;
	    int id;
	    double salary;

	    //method to display employee details
	    public void displayEmployee()
	    {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee id: " + id);
	        System.out.println("Employee Salary: " + salary);
	    }

	    public static void main(String[] args)
	    {
	        //create object
	        Employee emp = new Employee();

	        //Assign values
	        emp.name = "Rohan";
	        emp.id = 1;
	        emp.salary = 500000;

	        //calling method
	        emp.displayEmployee();
	    }

}
