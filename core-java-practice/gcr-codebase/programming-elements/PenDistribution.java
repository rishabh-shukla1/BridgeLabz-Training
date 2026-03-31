package programming_elements;

public class PenDistribution {
	
	public static void main(String[] args) {

        int totalP = 14;
        int s = 3;
        
        // calculation 
        // this will give quotinet
        int pensPerS = totalP / s;
        
        // this will give remainder
        int remainPens = totalP % s;

        System.out.println("The Pen Per Student is " + pensPerS +
                           " and the remaining pen not distributed is " + remainPens);
    }

}
