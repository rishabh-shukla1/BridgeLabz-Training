package scenario_based.HotelManagementSystem;

public abstract class Room implements PricingStrategy {
	
	private int roomId;
	private double price;
	private boolean status;
	
	 Room(int roomId, double price) {
		
		this.roomId = roomId;
		this.price = price;
		this.status=true;	
	}

	 public int getRoomId() {
		 return roomId;
	 }

	 public double getPrice() {
		 return price;
	 }

	 public void setPrice(double price) {
		 this.price = price;
	 }

	 public boolean isStatus() {
		 return status;
	 }

	 public void setStatus(boolean status) {
		 this.status = status;
	 }
	 
	 public abstract double  seasonalPricing(int amount,int days);
	 
}
