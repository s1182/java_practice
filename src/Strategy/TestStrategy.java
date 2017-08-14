package Strategy;

public class TestStrategy {
	public static void main(String args[])	{
		
		int listToBeSorted[] = {11,33,44,5,2,32,45,52,11,557,24}; 
		
		MySorter mysorter = new MySorter();
		mysorter.setSorter (new BubbleSort());
		mysorter.doSort(listToBeSorted);
		
		mysorter.setSorter (new QuickSort());
		mysorter.doSort(listToBeSorted);
	
	}
	
	

}
