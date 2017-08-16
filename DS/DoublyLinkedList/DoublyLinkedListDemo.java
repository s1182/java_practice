package DoublyLinkedList;

public class DoublyLinkedListDemo {
	public static void main(String args[])	{
		
		DoublyLinkedList theList =  new DoublyLinkedList(); 
		
		theList.insertFirst(11);
		theList.insertFirst(22);
		theList.insertFirst(33);
		
		theList.insertLast(44);
		theList.insertLast(55);
		theList.insertLast(66);
		
		theList.displayForward();
		theList.displayBackward(); 
		
		theList.deleteFirst(); 
		theList.deleteLast();
		theList.deleteKey(33);	
		
		theList.displayForward();
		
		theList.insertAfter(44,77);
		theList.insertAfter(77,78);
		
		theList.displayForward();
	}

}
