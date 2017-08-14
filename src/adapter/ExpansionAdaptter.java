package adapter;

public class ExpansionAdaptter implements Socket{
	
	private Plug plug; 
	
	ExpansionAdaptter(Plug plug)	{
		this.plug= plug;
	}
		
	public String getInput()	{
		String input = plug.getInput(); 
		input = input + " power converted to 2-pin";
		System.out.println(input); 
		return input; 
	}

}
