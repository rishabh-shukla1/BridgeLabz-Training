package scenario_based.HospitalManagementSystem;

public class HospitalMain {
	
	public static void main(String[] args){
		
		Hospital hospital = new Hospital();

        // Creating Doctors
        Doctor d1 = new Doctor("Dr. Sharma", "987654321", "Cardiologist", 1);
        Doctor d2 = new Doctor("Dr. Verma", "912345678", "Physician", 2);

        // Creating Patients
        Patient p1 = new Inpatient("Ravi", "999888777", 101, 30, d1, 5, 2000);
        Patient p2 = new OutPatient("Amit", "888777666", 102, 25,d2, 500);

        // CREATE
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        System.out.println("------ Patient List ------");
        hospital.display();

        // UPDATE
        hospital.updateAge(101, 35);

        // DELETE
        hospital.deletPatient(102);

        System.out.println("------ After Update ------");
        hospital.display();
    }

}
