package adapter;

public class Plug {
	private String specification; 

	protected String getInput() {		
		return specification; 
	}	
	
	public Plug() { 
		System.out.println("3-Pin created."); 
		specification = "3-Pin"; 
	}
}
