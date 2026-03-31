package class_and_object;

public class Circle {
	
	double radius;

    //calculate area
    public double calculateArea()
    {
        return 3.14 * radius * radius;
    }

    //calculate circumference
    public double calculateCircumference()
    {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args)
    {
        Circle c = new Circle();

        // value given
        c.radius = 2.5;

        // calling methods
        double area = c.calculateArea();
        double circum = c.calculateCircumference();

        //display
        System.out.println("Area of circle:-:"+area);
        System.out.println("Circumference of circle:-"+circum);
    }
	

}
