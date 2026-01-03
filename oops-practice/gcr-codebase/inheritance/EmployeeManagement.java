package inheritance;

public class EmployeeManagement
{
	public static void main(String args[])
	{
		//Polymorphism
        Employee e1 = new Manager("Rishabh", 101, 60000, 5);
        Employee e2 = new Developer("Amit", 102, 50000, "Java");
        Employee e3 = new Intern("Neha", 103, 15000, 6);

        // Display details
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
		
	}

}
//Base class
class Employee
{
	 String name;
	 int id;
	 double salary;
	
	 //Constructor
	 Employee(String name, int id, double salary)
	 {
	     this.name = name;
	     this.id = id;
	     this.salary = salary;
	 }
	
	 //Method to display employee details
	 void displayDetails()
	 {
	     System.out.println("Name   :-" + name);
	     System.out.println("ID     :-" + id);
	     System.out.println("Salary :-" + salary);
	 }
}

//Manager subclass
class Manager extends Employee
{
	 int teamSize;
	
	 Manager(String name, int id, double salary, int teamSize)
	 {
	     super(name, id, salary);
	     this.teamSize = teamSize;
	 }
	
	 // Overriding displayDetails()
	 void displayDetails()
	 {
	     super.displayDetails();
	     System.out.println("Team Size :-" + teamSize);
	     
	 }
	}
	
	//Developer subclass
	class Developer extends Employee
	{
	 String programmingLanguage;
	
	 Developer(String name, int id, double salary, String programmingLanguage)
	 {
	     super(name, id, salary);
	     this.programmingLanguage = programmingLanguage;
	 }
	
	 // Overriding displayDetails()
	 void displayDetails()
	 {
	     super.displayDetails();
	     System.out.println("Programming Language :-" + programmingLanguage);
	    
	 }
}
//Intern subclass
class Intern extends Employee
{
	 int duration;  
	
	 Intern(String name, int id, double salary, int duration)
	 {
	     super(name, id, salary);
	     this.duration = duration;
	 }
	
	 //Overriding displayDetails()
	 void displayDetails()
	 {
	     super.displayDetails();
	     System.out.println("Internship Duration :-" + duration + " months");
	   
	 }
}

