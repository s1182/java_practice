package observer;

public class TemperatureCustomer1 implements TemperatureObserver{
	
		public void update(int temperature)		{
			System.out.println("Customer 1 found temperature as: " + temperature);
		}
}
