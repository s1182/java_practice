package observer;

public class TestObserver {
	public static void main(String args[])	{
		
		TemperatureStation  temperatureStation = new TemperatureStation(38);
		TemperatureCustomer1 tc1 = new TemperatureCustomer1(); 
		TemperatureCustomer2 tc2 = new TemperatureCustomer2();
		
		temperatureStation.addObserver(tc1);
		temperatureStation.addObserver(tc2);
		
		temperatureStation.setTemperature(66);
		
		temperatureStation.removeObserver(tc1);
		
		temperatureStation.setTemperature(33);
	}
	

}
