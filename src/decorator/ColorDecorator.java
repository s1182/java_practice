package decorator;

public class ColorDecorator extends HouseDecorator {
	private String addColors()
	{
		return "+ Colors";  
	}
	public ColorDecorator (House house)
	{
		super (house);
	}
	public String makeHouse()
	{
		return house.makeHouse() + addColors(); 
	}
}
