package programming_elements;

import java.util.*;
public class PerimeterRectangle {
	public static void main(String[] args) {
		
        Scanner kb = new Scanner(System.in);

        // Input length
        System.out.print("Enter the length of the rectangle:-");
        double length = kb.nextDouble();

        // Input width
        System.out.print("Enter the width of the rectangle:-");
        double width =kb.nextDouble();

        
        double perimeter = 2 * (length + width);

     
        System.out.println("Perimeter of the rectangle is:-" + perimeter);

        kb.close();
    }
}


