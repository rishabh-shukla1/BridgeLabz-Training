package JUnit.junit;

public class DatabaseConnection {

	boolean connected=false;
	public void connect() {
		connected=true;
	}

	public void disconnect() {
		
		connected=false;
		
	}

}
