package scenario_based.Online_Voting_System;

public class MainElection {
	public static void main(String[] args) {
	
	OnlineElection election = new OnlineElection();

    election.registerVoter(new Voter(1, "Rishabh"));
    election.registerVoter(new Voter(2, "Amit"));

    election.addCandidate(new Candidate(101, "Candidate A"));
    election.addCandidate(new Candidate(102, "Candidate B"));

    try
    {
        election.castVote(1, 101);
        election.castVote(2, 102);
        election.castVote(1, 102);  
    }
    catch(DuplicateVoteException e)
    {
        System.out.println(e.getMessage());
    }

    election.declareResult();
	}

}
