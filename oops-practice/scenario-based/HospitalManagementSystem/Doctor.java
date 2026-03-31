package scenario_based.HospitalManagementSystem;

public class Doctor{
	
	private String doctorName;
	private String phono;
	private String masterIn;
	private int doctorId;
	
	public Doctor(String doctorName, String phono, String masterIn, int doctorId) {		
		this.doctorName = doctorName;
		this.phono = phono;
		this.masterIn = masterIn;
		this.doctorId = doctorId;
		
	}
	
	public String getDoctorName() {
		return doctorName;
	}

	public String getMasterIn() {
		return masterIn;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void  displayInfo() {
		
		 System.out.println("Doctor ID     : " + doctorId);
	     System.out.println("Name          : " + doctorName);
	     System.out.println("Specialist    : " + masterIn);	
	}	

}
