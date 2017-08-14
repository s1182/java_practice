package observer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TemperatureStation implements TemperatureSubject{
	Set<TemperatureObserver> temperatureObservers; 
	int temperature;
	
	public TemperatureStation (int temperature)	{
		temperatureObservers = new HashSet <TemperatureObserver>(); 
		this.temperature = temperature; 				
	}
	
	public void addObserver (TemperatureObserver temperatureObserver)	{
		temperatureObservers.add(temperatureObserver)   ;		
	}
	
	public void removeObserver (TemperatureObserver temperatureObserver)	{
		temperatureObservers.remove(temperatureObserver)   ;
	}
	
	public void NotifyStation()	{
		Iterator<TemperatureObserver> it = temperatureObservers.iterator();
		
		if ( it.hasNext() )	{
			TemperatureObserver temperatureObserver = it.next(); 
			temperatureObserver.update(temperature);			
		}		
	}
	
	public void setTemperature(int newTemperature)	{
		System.out.println ("Setting temerature to " + newTemperature);
		temperature = newTemperature; 
		NotifyStation(); 
	}	
	
}
