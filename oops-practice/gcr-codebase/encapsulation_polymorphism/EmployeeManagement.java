package encapsulation_polymorphism;


interface Department
{
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee implements Department
{
    //Encapsulated variables
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    //Constructor
     Employee(int employeeId, String name, double baseSalary)
    {
        this.employeeId = employeeId;
        this.name = name;
        setBaseSalary(baseSalary);   // validation
    }

    //abstract method
    public abstract double calculateSalary();

    //concrete method
    public void displayDetails()
    {
        System.out.println("Employee Id   :-" + employeeId);
        System.out.println("Name          :-" + name);
        System.out.println("Department    :-" + department);
        System.out.println("Salary        :-" + calculateSalary());
    }

    //Getter
    public double getBaseSalary()
    {
        return baseSalary;
    }

    // Setter with validation
    public void setBaseSalary(double baseSalary)
    {
        if (baseSalary > 0)
        {
            this.baseSalary = baseSalary;
        }
        else
        {
            System.out.println("Invalid Salary");
        }
    }

    //Interface methods
    public void assignDepartment(String deptName)
    {
        this.department = deptName;
    }

    public String getDepartmentDetails()
    {
        return department;
    }
}

class FullTimeEmployee extends Employee
{
    private double fixedSalary;

    public FullTimeEmployee(int id, String name, double baseSalary, double fixedSalary)
    {
        super(id, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    public double calculateSalary()
    {
        return getBaseSalary() + fixedSalary;
    }
}

class PartTimeEmployee extends Employee
{
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double ratePerHour)
    {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public double calculateSalary()
    {
        return getBaseSalary() + (hoursWorked * ratePerHour);
    }
}

public class EmployeeManagement {
	
	public static void main(String[] args)
    {
        // Polymorphic list
        Employee e1 = new FullTimeEmployee(101, "Amit", 20000, 15000);
        Employee e2 = new PartTimeEmployee(102, "Neha", 5000, 40, 300);

        // Assign departments
        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        // Polymorphism: same reference, different behavior
        Employee[] employees = { e1, e2 };

        for (Employee e : employees)
        {
            e.displayDetails();
        }
    }

}
