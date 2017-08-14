package singleton;

public class Singleton {
	public static Singleton instance ; 
	
	private Singleton(){}
	
	
	public synchronized static Singleton getInstance() 
	{
		if (instance == null )
		{
			synchronized (Singleton.class)
			{
				if (instance == null )
				{
					instance = new Singleton();
					System.out.println("new instance");				
				}
			}
		}
		else
		{
			System.out.println("old instance");				
		}
		return instance ;
		
	}

}
