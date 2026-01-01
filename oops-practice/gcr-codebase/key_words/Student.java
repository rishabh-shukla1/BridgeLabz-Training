package key_words;

public class Student
{
	//Static variable
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    //Final variable
    private final int rollNumber;

    private String name;
    private String grade;

    //Constructor using this
    Student(int rollNumber, String name, String grade)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    //Static method
    public static void displayTotalStudents()
    {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Update grade using instanceof
    public void updateGrade(String newGrade)
    {
        if (this instanceof Student)
        {
            grade = newGrade;
            System.out.println("Grade updated to:-" + grade);
        }
    }

    //Display method
    public void display()
    {
        System.out.println("University Name:-" + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name:-" + name);
        System.out.println("Grade:-" + grade);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student(101, "Hemashree", "A");
        Student s2 = new Student(102, "Sharmila", "B");

        Student.displayTotalStudents();
        s1.display();
        s2.display();
        s2.updateGrade("A");
        s2.display();
    }
	

}
