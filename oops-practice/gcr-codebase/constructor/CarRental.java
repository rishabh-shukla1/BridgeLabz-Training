package constructor;

public class CarRental 
{
		private String customerName;
	    private String carModel;
	    private int rentalDays;
	    private double totalCost;
	
	    //Parameterized Constructor
	    CarRental(String customerName, String carModel, int rentalDays) {
	        this.customerName = customerName;
	        this.carModel = carModel;
	        this.rentalDays = rentalDays;
	        calculateTotalCost();   // calculate cost when object is created
	    }
	
	    //Default Constructor
	    CarRental()
	    {
	    	//constructor chaining
	        this("Guest", "Standard", 1);   
	    }
	
	    // Method to calculate total cost
	    private void calculateTotalCost() 
	    {
	          
	        totalCost = rentalDays * 1000;
	    }
	
	    public void display() {
	        System.out.println("Customer Name :-" + customerName);
	        System.out.println("Car Model     :-" + carModel);
	        System.out.println("Rental Days   :-" + rentalDays);
	        System.out.println("Total Cost    :-" + totalCost);
	    }
	
	    public static void main(String[] args) 
	    {
	        CarRental r1 = new CarRental();   // default
	        CarRental r2 = new CarRental("Rishabh", "Toyota Fortuner", 5); // parameterized
	
	        System.out.println("Default Rental:-");
	        r1.display();
	
	        System.out.println("Customer Rental:-");
	        r2.display();
	    }

}
