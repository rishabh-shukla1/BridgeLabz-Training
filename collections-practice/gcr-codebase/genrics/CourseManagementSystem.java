package genrics;
import java.util.*;

abstract class CourseType{
	
	 private String courseName;

	    public CourseType(String courseName) {
	        this.courseName = courseName;
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public abstract String getEvaluationType();
	
}

class ExamCourse extends CourseType
{
    public ExamCourse(String name) 
    {
        super(name);
    }

    @Override
    public String getEvaluationType() {
        return "Exam Based";
    }
}

class AssignmentCourse extends CourseType
{
    public AssignmentCourse(String name) 
    {
        super(name);
    }

    @Override
    public String getEvaluationType() {
        return "Assignment Based";
    }
}

class ResearchCourse extends CourseType 
{
    public ResearchCourse(String name) 
    {
        super(name);
    }

    @Override
    public String getEvaluationType() {
        return "Research Based";
    }
}


class course<T extends CourseType>{
	

    private T courseType;

    public course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void showDetails() 
    {
        System.out.println(courseType.getCourseName() +"-Evaluation: " + 
            courseType.getEvaluationType()
        );
    }
	
}

class UniversityUtil {

    public static void displayCourses(
            List<? extends CourseType> courses) {

        for (CourseType c : courses) {
            System.out.println(
                c.getCourseName() + 
                " | " + 
                c.getEvaluationType()
            );
        }
    }
}
public class CourseManagementSystem {
	
	  public static void main(String[] args) {

	        // Create course types
	        ExamCourse java = new ExamCourse("Java");
	        AssignmentCourse ai = new AssignmentCourse("AI");
	        ResearchCourse ml = new ResearchCourse("Machine Learning");

	        // Generic course objects
	        course<ExamCourse> c1 = new course<>(java);
	        course<AssignmentCourse> c2 = new course<>(ai);
	        course<ResearchCourse> c3 = new course<>(ml);

	        // Show individual details
	        c1.showDetails();
	        c2.showDetails();
	        c3.showDetails();

	        // Mixed list using wildcard
	        List<CourseType> allCourses = new ArrayList<>();
	        allCourses.add(java);
	        allCourses.add(ai);
	        allCourses.add(ml);

	        System.out.println("\nAll Courses:");
	        UniversityUtil.displayCourses(allCourses);
	    }
	
	

}
