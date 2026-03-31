package scenario_based.HotelManagementSystem;

public class DeluxeRoom extends Room{

	DeluxeRoom(int roomId, double price) {
		super(roomId, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double totalPay(int days) {
		// TODO Auto-generated method stub
		return days*getPrice();
	}

	@Override
	public double seasonalPricing(int amount, int days) {
		// TODO Auto-generated method stub
		return 0;
	}

}
