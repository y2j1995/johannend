
public class Candidate {
	
	String c_id;
	String c_name;
	String c_const;
	
	int votes;
	
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_const() {
		return c_const;
	}
	public void setC_const(String c_const) {
		this.c_const = c_const;
	}
	public String getCand_id() {
		return c_id;
	}
	public void setCand_id(String c_id) {
		this.c_id = c_id;
	}
	
	public Candidate(String c_name, String c_const, String c_id,int votes) {
		super();
		this.c_name = c_name;
		this.c_const = c_const;
		this.c_id = c_id;
		this.votes = votes;
	}
	

	
}
