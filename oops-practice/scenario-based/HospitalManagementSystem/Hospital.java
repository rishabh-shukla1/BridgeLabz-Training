package scenario_based.HospitalManagementSystem;
import java.util.*;

public class Hospital{
	
	private List<Patient> p=new ArrayList<>();
	
	//create
	public void addPatient(Patient patient) {
		
		p.add(patient);
		
	}
	// Read
	public void display() {
		
		for(Patient patient:p) {
			
			patient.displayInfo();
			System.out.println("Patient Added");
		}
	}
	//Update 
	
	public void updateAge(int id,int age) {
		
		for(Patient patient:p) {
			
			if(patient.getPatientId()==id) {
				patient.setAge(age);
				System.out.println("Age Updated");
                return;
			}
		}
		System.out.println("Patient Not Found");
	}
	//Delete
	
	public void deletPatient(int id) {
		
		for(Patient patient:p)
		{
			if(patient.getPatientId()==id) {
				p.remove(patient);
				System.out.println("Patient Deleted");
			
				return ;
			}
		}
		System.out.println("Patient Not Found");
		
	}
	
	

}
