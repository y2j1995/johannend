import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class CastingVote {
	
	ArrayList<VoteClass>_candidates = new ArrayList<VoteClass>();
	String vote_id;

  	public CastingVote (String id)
	{
		 vote_id = id;
	};

	 public void addVote(VoteClass arg) {
	     _candidates.add(arg);
	   }
	
	 public String getVoteID ()
	 {
		 return vote_id;
	 };
	 
	 
	 
	 public String vote_result()
	 {
		 int vote1=0;
		 int vote2=0;
		
		 Enumeration<VoteClass> candidates = Collections.enumeration(_candidates);
		 String result = "Final Voting Results \n" ;
		
		 while(candidates.hasMoreElements())
		 {
	
			 VoteClass each = (VoteClass) candidates.nextElement();
			
			 if(each.getCandidate().getCand_id() == "100")
			 {
				
				 vote1=vote1+each.getCandidate().votes;
			
			 }
			 else if(each.getCandidate().getCand_id() == "101")
			 {
			
				 vote2=vote2+each.getCandidate().votes;
				
			 }
			 
			 result += "\t" + each.getCandidate().getC_name() + "\t" + each.getCandidate().getC_const()  + each.getCandidate().getCand_id()+"\n";

			 
			
		 }
		 
	
		 return result;
		 
		 
		
		 
	 }
	  
}



