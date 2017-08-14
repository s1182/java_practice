package decorator;

public class LightsDecorator extends HouseDecorator{
	
	private String addLights() {
		return " + Lights" ; 
	}
	
	public LightsDecorator(House house)	{
		super(house);
	}
	
	public String makeHouse() {
		return house.makeHouse() + addLights();
	}
	
}
