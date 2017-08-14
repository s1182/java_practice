package abstract_factory;

public class GM extends Car {
	public Parts getWheels()
	{
		return new Parts("GM Wheels");
	}
	public Parts getMirrors()
	{
		return new Parts("GM Mirrors");
	}
	public Parts getEngine()
	{
		return new Parts("GM Engine");
	}
	public Parts getBody()
	{
		return new Parts("GM Body");
	}
}
