package scenario_based.cab_booking;

class NoDriverAvailableException extends Exception{
	
	public NoDriverAvailableException(String msg) {
		super(msg);
	}
	
}
