package decorator;

public class TestDecorator {
	public static void main(String args[])
	{
		House house = new LightsDecorator(new ColorDecorator (new SimpleHouse()));
		System.out.println(house.makeHouse());
	}

}
