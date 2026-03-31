package scenario_based.Online_Voting_System;

public class Candidate {
	
	private int id;
	private String candidateName;
	private int voteCount;
	
	public Candidate(int id, String candidateName) {
		this.id = id;
		this.candidateName = candidateName;
		this.voteCount=0;
	}

	public int getId() {
		return id;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public int getVoteCount() {
		return voteCount;
	}
	
	public void addVote()
    {
        voteCount++;
    }
	
	
}
