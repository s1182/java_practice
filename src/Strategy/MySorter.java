package Strategy;

public class MySorter extends Sorter {
	
	public void doSort(int listToSort[])	{		
		getSorter().sort(listToSort);
	}

}
