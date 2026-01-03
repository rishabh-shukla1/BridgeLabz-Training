package inheritance;

//Base class
class Course
{
	 String courseName;
	 int duration;
	
	 Course(String courseName, int duration)
	 {
	     this.courseName = courseName;
	     this.duration = duration;
	 }
}

	//Child class
class OnlineCourse extends Course
{
	
	 String platform;
	 boolean isRecorded;
	
	 OnlineCourse(String courseName, int duration, String platform, boolean isRecorded)
	 {
	     super(courseName, duration);
	     this.platform = platform;
	     this.isRecorded = isRecorded;
	 }
}

// Grandchild class
class PaidOnlineCourse extends OnlineCourse
{
	 double fee;
	 double discount;
	
	 PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount)
	 {
	     super(courseName, duration, platform, isRecorded);
	     this.fee = fee;
	     this.discount = discount;
	 }
	
	 void displayCourse()
	 {
	     System.out.println("Course:-" + courseName);
	     System.out.println("Duration:-" + duration + " weeks");
	     System.out.println("Platform:-" + platform);
	     System.out.println("Recorded:-" + isRecorded);
	     System.out.println("Fee:-" + fee);
	     System.out.println("Discount:-" + discount + "%");
	 }
}

//Main class
public class CourceOnlineSystem
{
 public static void main(String[] args)
 {
     PaidOnlineCourse c = new PaidOnlineCourse("Java Full Stack", 12, "Udemy", true, 8000, 20);
     c.displayCourse();
 }
}
