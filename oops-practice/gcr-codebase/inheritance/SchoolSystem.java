package inheritance;

//Superclass
class Person
{
	 String name;
	 int age;
	
	 Person(String name, int age)
	 {
	     this.name = name;
	     this.age = age;
	 }
	
	 void displayPersonInfo()
	 {
	     System.out.println("Name: " + name);
	     System.out.println("Age: " + age);
	 }
}

//Teacher
class Teacher extends Person
{
	 String subject;
	
	 Teacher(String name, int age, String subject)
	 {
	     super(name, age);
	     this.subject = subject;
	 }
	
	 void displayRole()
	 {
	     System.out.println("Role: Teacher");
	     displayPersonInfo();
	     System.out.println("Subject: " + subject);
	 }
}

//Student
class Student extends Person
{
	 String grade;
	
	 Student(String name, int age, String grade)
	 {
	     super(name, age);
	     this.grade = grade;
	 }
	
	 void displayRole()
	 {
	     System.out.println("Role:-Student");
	     displayPersonInfo();
	     System.out.println("Grade:-" + grade);
	 }
}

//Staff
class Staff extends Person
{
	 String department;
	
	 Staff(String name, int age, String department)
	 {
	     super(name, age);
	     this.department = department;
	 }
	
	 void displayRole()
	 {
	     System.out.println("Role:-Staff");
	     displayPersonInfo();
	     System.out.println("Department:-" + department);
	 }
}

//Main class
public class SchoolSystem
{
	 public static void main(String[] args)
	 {
	     Teacher t = new Teacher("Amit", 40, "Math");
	     Student s = new Student("Riya", 16, "10th");
	     Staff st = new Staff("Raj", 35, "Office");
	
	     System.out.println();
	     t.displayRole();
	
	     System.out.println();
	     s.displayRole();
	
	     System.out.println();
	     st.displayRole();
	 }
}