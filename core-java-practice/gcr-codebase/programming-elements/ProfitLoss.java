package programming_elements;

public class ProfitLoss {

	public static void main(String[] args) {
		
		int cp=129;
		int sp=191;
		double profit=sp-cp;
		double percentage=(profit/cp)*100;
		
		System.out.println(
				"The Cost Price is INR "+cp +" ans Selling is INR " +sp+
				"\nThe Profit is INR "+profit + " and the Profit Percentage is "+ percentage);;
		

	}

}
