package scenario_based.HospitalManagementSystem;

abstract class Patient implements IPayable 
{
	private String patientName;
	private String phno;
	private int patientId;
	private int age;
	private Doctor doctor;
	
	 Patient(String patientName, String phno, int patientId, int age,Doctor doctor) {
		this.patientName = patientName;
		this.phno = phno;
		this.patientId = patientId;
		this.age = age;
		this.doctor=doctor;
	}

	 public String getPatientName() {
		 return patientName;
	 }

	 public int getPatientId() {
		 return patientId;
	 }
	 
	 public Doctor getDoctor()
	 {
	        return doctor;
	 }
	 

	 public void setDoctor(Doctor doctor)
	 {
	        this.doctor = doctor;
	 }

	 

	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age=age;
	 }
	public abstract void displayInfo();
	
	public abstract double calculateBill();
	
}

	
	


