import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CVoteTest {
	Candidate c1,c2;
	CastingVote v1;  


	@Before
	public void setUp() throws Exception {
		
		c1 = new Candidate ("alfran","Mapusa","100",0);
		c2 = new Candidate ("yogeta","Margao","100",0);
		v1 = new CastingVote("SELF");
		v1.addVote(new VoteClass(c1));
		v1.addVote(new VoteClass(c2));
		System.out.println(v1.vote_result());


	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
