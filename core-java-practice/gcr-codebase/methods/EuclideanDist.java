package methods;

public class EuclideanDist
{
	 //method to find distance
	
    public static double findDistance(int x1,int y1,int x2,int y2)
    {
        return Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
    }

    //method to find slope and intercept
    
    public static double[] find(int x1,int y1,int x2,int y2)
    {
        double m = (double)(y2 - y1) / (x2 - x1);
        
        double b = y1 - m * x1;
        
        return new double[]{m, b};
    }

    public static void main(String[] args)
    {
    	
        int x1=1,y1=2,x2=4,y2=6;

        //Display
        System.out.println("Distance -:" + findDistance(x1,y1,x2,y2));

        double[] line = find(x1,y1,x2,y2);
        System.out.println("Slope -:"+ line[0]);
        System.out.println("Intercept -:" + line[1]);
    }

}
