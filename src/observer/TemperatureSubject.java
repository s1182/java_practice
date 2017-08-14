package observer;

public interface TemperatureSubject {
	
	public void addObserver (TemperatureObserver temperatureObserver) ; 
	
	public void removeObserver (TemperatureObserver temperatureObserver);
	
	public void NotifyStation();
}
