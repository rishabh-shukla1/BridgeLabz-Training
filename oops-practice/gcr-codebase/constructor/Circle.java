package constructor;

public class Circle 
{
	   private double radius;

	    // Default constructor
	    Circle() 
	    {
	    // calls the parameterized constructor
	        this(1.0);   
	    }

	    //Parameterized constructor
	    Circle(double radius)
	    {
	        this.radius = radius;
	    }

	    public double area() 
	    {
	        return 3.14 * radius * radius;
	    }

	    public void display()
	    {
	        System.out.println("Radius	:-" + radius);
	        System.out.println("Area	:-" + area());
	    }

	    public static void main(String[] args) {
	    	//uses default radius
	        Circle c1 = new Circle();    
	        //uses user-provided radius
	        Circle c2 = new Circle(5.5);  

	        System.out.println("Circle 1:");
	        c1.display();

	        System.out.println("Circle 2:");
	        c2.display();
	    }
}
