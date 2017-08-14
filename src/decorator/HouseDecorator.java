package decorator;

abstract class HouseDecorator implements House {
	protected House house; 
	
	public HouseDecorator (House house)	{
		this.house = house; 
	}
	
	public String makeHouse()	{
		return house.makeHouse(); 
	}	
}
