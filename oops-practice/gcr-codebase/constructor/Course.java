package constructor;

public class Course 
{
		//Instance variables
	    private String courseName;
	    private int duration;      
	    private double fee;
	
	    //Class variable (static)
	    private static String instituteName = "BridgeLabz";
	
	    //Constructor
	    Course(String courseName, int duration, double fee) 
	    {
	        this.courseName = courseName;
	        this.duration = duration;
	        this.fee = fee;
	    }
	
	    //Instance method
	    public void displayCourseDetails()
	    {
	        System.out.println("Course Name    :-" + courseName);
	        System.out.println("Duration       :-" + duration + " months");
	        System.out.println("Fee            :-" + fee);
	        System.out.println("Institute Name :-" + instituteName);
	    }
	
	    //Class method
	    public static void updateInstituteName(String newName)
	    {
	        instituteName = newName;
	    }
	
	    public static void main(String[] args)
	    {
	        Course c1 = new Course("Java Full Stack", 6, 45000);
	        Course c2 = new Course("Python", 4, 30000);
	
	        System.out.println("Before Updating Institute:");
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();
	
	     
	        Course.updateInstituteName("Tech Academy");
	
	        System.out.println("After Updating Institute:");
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();
	    }

}
