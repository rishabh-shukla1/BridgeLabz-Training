package programming_elements;

public class VolumeEarth {
	 public static void main(String[] args) {

	        double earthRadiKm = 6378.0;
	        
	        double piValue = Math.PI;
            // calculation  volume of sphere formula is used here
	        
	        double earthVolKm = (4.0 / 3.0) * piValue * Math.pow(earthRadiKm, 3);

	        double kmToMile = 0.621371;
	        double earthRadiMile = earthRadiKm * kmToMile;
             
	        double earthVolMile = (4.0 / 3.0) * piValue * Math.pow(earthRadiMile, 3);

	        System.out.println("The volume of earth in cubic kilometers is " 
	                            + earthVolKm +
	                            " and cubic miles is " 
	                            + earthVolMile);
	    }

}
