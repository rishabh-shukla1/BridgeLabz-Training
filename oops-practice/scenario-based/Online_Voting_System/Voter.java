package scenario_based.Online_Voting_System;

public class Voter {
	
	private int voterId;
	private String name;
	private boolean status;
	
	public Voter(int voterId, String name) {
		this.voterId = voterId;
		this.name = name;
		this.status = false;
	}

	public int getVoterId() {
		return voterId;
	}

	public boolean isStatus() {
		return status;
	}

	public void markVoted()
    {
       status = true;
    }
	public String getName() {
		return name;
	}
	
	
	
	
	

}
