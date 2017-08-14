package abstract_factory;

public class CarType {
	private Car car; 
	
	public static void main(String args[])
	{
		CarType type = new CarType();
		Car car = type.getCar("GM");
		System.out.println ("Wheels:"+ car.getWheels().getSpecification());
		System.out.println ("Wheels:"+ car.getMirrors().getSpecification());
		System.out.println ("Wheels:"+ car.getEngine().getSpecification());
		System.out.println ("Wheels:"+ car.getBody().getSpecification());
	}

	public Car getCar(String carType){
		
		if (carType.equals("GM"))
		{
			car  = new GM(); 
		}
		else if (carType.equals("BMW")) 
		{
			car = new BMW(); 
		}		
		return car; 
	}
	
}
