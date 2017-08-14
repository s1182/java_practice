package factory;

public class MainFactory 
{
	public static void main(String args[])
	{
		factory ptFactory = new factory(); 
		Pet pet = ptFactory.getPet("Meaw");
		System.out.println( pet.petSound());		
	}	
}
