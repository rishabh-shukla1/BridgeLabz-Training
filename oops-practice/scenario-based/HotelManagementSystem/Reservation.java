package scenario_based.HotelManagementSystem;

public class Reservation {
	
	private Guest guest;
	private Room room;
	private double bill;
	private int days;
	
	Reservation(Guest guest, Room room,int days) throws RoomNotAvailableException{
		
		if(room.isStatus()==false){
			
			throw new RoomNotAvailableException("Room is Not available");
		}
		room.setStatus(false);	
		this.guest = guest;
		this.room = room;
		this.days=days;
		this.bill=room.totalPay(days);
		
	}
	
	public void checkOut(){
		room.setStatus(false);
		System.out.println("SuccessFully Checked out");	
		 
	}
	
	public void invoice() {
		System.out.println("Guest Name : " + guest.getGuestName());
		System.out.println("Room ID : " + room.getRoomId());
		System.out.println("Days : " + days);
		System.out.println("Total Bill : " + bill);
		
	}

}
