package scenario_based.Online_Voting_System;
import java.util.*;

public abstract class ElectionService {
	
	protected List<Voter> voters=new ArrayList<>();
	protected List<Candidate> candidates=new ArrayList<>();
	protected List<Vote> votes=new ArrayList<>();
	
	 abstract void registerVoter(Voter v);
	 abstract void addCandidate(Candidate c);
	 abstract void castVote(int voterId, int candidateId) throws DuplicateVoteException;
	 abstract void declareResult();
    
	
	

}
