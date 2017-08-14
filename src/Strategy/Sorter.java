package Strategy;

public abstract class Sorter {
	private SortInterface sortInterface; 
	
	public void setSorter(SortInterface strategy)	{
		this.sortInterface = strategy ; 
	}

	public SortInterface getSorter()	{
		return this.sortInterface ; 
	}

	public abstract void doSort(int listToSort[] );
}
