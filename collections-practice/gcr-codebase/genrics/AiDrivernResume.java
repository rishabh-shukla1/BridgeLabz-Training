package genrics;
import java.util.*;

abstract class JobRole {

    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String getRoleName();
}



class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) {
        super(name);
    }

    public String getRoleName() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole
{
    public DataScientist(String name) 
    {
        super(name);
    }

    public String getRoleName() 
    {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole 
{
    public ProductManager(String name) 
    {
        super(name);
    }

    public String getRoleName() 
    {
        return "Product Manager";
    }
}

class Resume<T extends JobRole> {

    private T role;

    public Resume(T role) {
        this.role = role;
    }

    public T getRole() {
        return role;
    }

    public void showDetails() {
        System.out.println( role.getCandidateName() +" applying for " +
            role.getRoleName());
    }
}



class ResumeScreeningUtil {

    public static void screenResumes(
            List<? extends JobRole> roles) {

        System.out.println("AI Screening Results:");

        for (JobRole r : roles) {
            System.out.println(
                r.getCandidateName() +
                " shortlisted for " +
                r.getRoleName()
            );
        }
    }
}

public class AiDrivernResume {
	
	
	 public static void main(String[] args) {

	        // Create job roles
	        SoftwareEngineer se = new SoftwareEngineer("Rishabh");
	        DataScientist ds = new DataScientist("Amit");
	        ProductManager pm = new ProductManager("Neha");

	        // Generic resumes
	        Resume<SoftwareEngineer> r1 = new Resume<>(se);
	        Resume<DataScientist> r2 = new Resume<>(ds);
	        Resume<ProductManager> r3 = new Resume<>(pm);

	        // Show individual resume details
	        r1.showDetails();
	        r2.showDetails();
	        r3.showDetails();

	      
	        List<JobRole> p = new ArrayList<>();
	        p.add(se);
	        p.add(ds);
	        p.add(pm);

	        System.out.println("\nScreening:");
	        ResumeScreeningUtil.screenResumes(p);
	    }
	
	

}
