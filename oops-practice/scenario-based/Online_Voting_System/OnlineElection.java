package scenario_based.Online_Voting_System;

public class OnlineElection extends ElectionService {

	@Override
	void registerVoter(Voter v) {
		// TODO Auto-generated method stub
		 voters.add(v);
	}

	@Override
	void addCandidate(Candidate c) {
		// TODO Auto-generated method stub
		candidates.add(c);
	}

	@Override
	void castVote(int voterId, int candidateId) throws DuplicateVoteException {
		// TODO Auto-generated method stub
		
		Voter voter = null;
        Candidate candidate = null;

        for(Voter v : voters)
        {
            if(v.getVoterId() == voterId)
                voter = v;
        }

        for(Candidate c : candidates)
        {
            if(c.getId() == candidateId)
                candidate = c;
        }

        if(voter.isStatus())
        {
            throw new DuplicateVoteException("Voter has already voted!");
        }

        Vote vote = new Vote(voter, candidate);
        votes.add(vote);
        
        candidate.addVote();
        voter.markVoted();

        System.out.println("Vote casted successfully by "+voter.getName() );
		
	}

	@Override
	void declareResult() {
		// TODO Auto-generated method stub
		System.out.println("---- Election Results ----");
        for(Candidate c : candidates)
        {
            System.out.println(c.getCandidateName() + " : " + c.getVoteCount() + " votes");
        }
		
	}

}
