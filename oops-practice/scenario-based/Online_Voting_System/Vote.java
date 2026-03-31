package scenario_based.Online_Voting_System;

public class Vote {

	Voter vote;
	Candidate candidate;
	
	public Vote(Voter vote, Candidate candidate) {
	
		this.vote = vote;
		this.candidate = candidate;
	}
	public Voter getVote() {
		return vote;
	}

	public Candidate getCandidate() 
	{
		return candidate;
	}	
	
}
