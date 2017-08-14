package adapter;

public class TestAdapter {
		
	public static void main (String args[]) { 
		Socket socket;
		socket = new ExpansionAdaptter(new Plug());
		socket.getInput(); 
	}	
}
