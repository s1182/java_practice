package abstract_factory;

public class BMW extends Car {
	
	public Parts getWheels()
	{
		return new Parts("BMW Wheels");
	}
	public Parts getMirrors()
	{
		return new Parts("BMW Mirrors");
	}
	public Parts getEngine()
	{
		return new Parts("BMW Engine");
	}
	public Parts getBody()
	{
		return new Parts("BMW Body");
	}	
}
