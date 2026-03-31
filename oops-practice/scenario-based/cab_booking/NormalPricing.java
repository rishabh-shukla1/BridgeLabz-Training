package scenario_based.cab_booking;

public class NormalPricing implements fareCalculator{

	@Override
	public int FareCalculator(int d) {
		// TODO Auto-generated method stub
		return d*5;
	}
	

}
