package encapsulation_polymorphism;

interface Insurable{
	
	double calculateInsurance();
	String getInsuranceDetails();
	
}

abstract class  Vehicle{
	
	private int vehicleNumber;
	private String type;
	private double rentalRate;
	
	Vehicle(int vehicleNumber, String type , double rate){
		
		this.vehicleNumber=vehicleNumber;
	    this.type=type;
	    setRate(rate);
	}
	
	public double getRate() {
		
		return rentalRate;
	}
	
	public void setRate(double rentalRate) {
		
		if(rentalRate>0)
		{
			this.rentalRate=rentalRate;
			
		}
		else {
			System.out.println("Invalid");
		}
	}
	
	public String getType()
	{
		return type;
		
	}
	public abstract double calculateRentalCost(int days);
	
	public void display()
    {
        System.out.println("Vehicle No :-" + vehicleNumber);
        System.out.println("Type       :-" + type);
        System.out.println("Rate/Day   :-" + rentalRate);
    }
	
	
}

class Car extends Vehicle implements Insurable {

	Car(int vehicleNumber, String type, double rate) {
		super(vehicleNumber, type, rate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return getRate()*days;
	}

	@Override
	public double calculateInsurance() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public String getInsuranceDetails() {
		// TODO Auto-generated method stub
		return "Car Insurance Flat ₹500";
	}
	
}
class Bike extends Vehicle  implements Insurable{

	Bike(int vehicleNumber, String type, double rate) {
		super(vehicleNumber, type, rate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return getRate()*days;
	}

	@Override
	public double calculateInsurance() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public String getInsuranceDetails() {
		// TODO Auto-generated method stub
		return "Bike Insurance (Flat ₹200)";
	}
	
}
class Truck extends Vehicle  implements Insurable{

	Truck(int vehicleNumber, String type, double rate) {
		super(vehicleNumber, type, rate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return getRate()*days;
	}

	@Override
	public double calculateInsurance() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public String getInsuranceDetails() {
		// TODO Auto-generated method stub
		return "Truck Insurance (Flat ₹1000)";
	}
	
}

public class VehicleRentalSystem {
	
	public static void main(String args[]) {
		    Vehicle v1 = new Car(101, "Car", 1500);
		    Vehicle v2 = new Bike(102, "Bike", 500);
		    Vehicle v3 = new Truck(103, "Truck", 3000);

		    // Store all vehicles in one array
		    Vehicle[] vehicles = { v1, v2, v3 };

		    int days = 3;

		    for (Vehicle v : vehicles)
		    {
		        double rental = v.calculateRentalCost(days);
		        double insurance = 0;

		        // Interface check
		        if (v instanceof Insurable)
		        {
		            Insurable i = (Insurable) v;
		            insurance = i.calculateInsurance();
		            System.out.println(i.getInsuranceDetails());
		        }

		        v.display();
		        System.out.println("Rental Cost   :- " + rental);
		        System.out.println("Insurance     :- " + insurance);
		        System.out.println("Total Cost    :- " + (rental + insurance));
		        System.out.println("----------------------------------");
		    }}

}
