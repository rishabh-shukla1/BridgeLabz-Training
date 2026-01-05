package encapsulation_polymorphism;
interface MedicalRecord
{
    void addRecord(String diagnosis);
    String viewRecords();
}

abstract class Patient
{
    // Encapsulated fields
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;   // sensitive

    // Constructor
    Patient(int patientId, String name, int age)
    {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract double calculateBill();

    //Concrete method
    public void getPatientDetails()
    {
        System.out.println("Patient ID :- " + patientId);
        System.out.println("Name       :- " + name);
        System.out.println("Age        :- " + age);
    }

    //Protected methods for subclasses
    protected void setMedicalHistory(String history)
    {
        this.medicalHistory = history;
    }

    protected String getMedicalHistory()
    {
        return medicalHistory;
    }
}
class InPatient extends Patient implements MedicalRecord
{
    private int daysAdmitted;
    private double dailyCharge;

    InPatient(int id, String name, int age, int days, double charge)
    {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    @Override
    public double calculateBill()
    {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String diagnosis)
    {
        setMedicalHistory(diagnosis);
    }

    @Override
    public String viewRecords()
    {
        return getMedicalHistory();
    }
}

class OutPatient extends Patient implements MedicalRecord
{
    private double consultationFee;

    OutPatient(int id, String name, int age, double fee)
    {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill()
    {
        return consultationFee;
    }

    @Override
    public void addRecord(String diagnosis)
    {
        setMedicalHistory(diagnosis);
    }

    @Override
    public String viewRecords()
    {
        return getMedicalHistory();
    }
}

public class HospitalManagement
{
	 public static void main(String[] args)
	    {
	        Patient p1 = new InPatient(101, "Ravi", 40, 5, 2000);
	        Patient p2 = new OutPatient(102, "Neha", 25, 800);

	        // Add medical records
	        MedicalRecord m1 = (MedicalRecord) p1;
	        MedicalRecord m2 = (MedicalRecord) p2;

	        m1.addRecord("Fever and Infection");
	        m2.addRecord("General Checkup");

	        Patient[] patients = { p1, p2 };

	        for (Patient p : patients)
	        {
	            p.getPatientDetails();
	            System.out.println("Medical Record :- " + ((MedicalRecord) p).viewRecords());
	            System.out.println("Bill Amount   :- " + p.calculateBill());
	            System.out.println("-------------------------------");
	        }
	    }
}
