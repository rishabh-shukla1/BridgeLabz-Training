package scenario_based.HospitalManagementSystem;

public class Inpatient extends Patient 
{
	private int daysadmit;
	private int charge;
    
	Inpatient(String patientName, String phno, int patientId, int age, Doctor doctor, int daysadmit, int charge) {
		super(patientName, phno, patientId, age, doctor);
		// TODO Auto-generated constructor stub
		this.daysadmit=daysadmit;
		this.charge=charge;
	}

	
	

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		 System.out.println("OutPatient ID : " + getPatientId());
	        System.out.println("Name         : " + getPatientName());
	        System.out.println("Age          : " + getAge());
	        System.out.println("Doctor       : " + getDoctor().getDoctorName());
	        System.out.println("Consult Fee  : " + calculateBill());
	        System.out.println("--------------------------------");
		
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return daysadmit*charge;
	}

	

}
