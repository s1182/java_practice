package factory;

public class factory {

	public Pet getPet(String petType)	{
		Pet pet= null;		
		if ("Bow".equals(petType))		{
			pet = new DogClass();
		}
		else if("Meaw".equals(petType))	{
			pet = new Cat();
		}
		return pet; 
	}
}
