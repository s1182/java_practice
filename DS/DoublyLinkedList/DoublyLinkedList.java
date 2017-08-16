package DoublyLinkedList;

class Node
{
	int data; 
	Node next; 
	Node previous;
	
	Node (int data ){
		this.data = data; 
	}
	void displayLink(){
		System.out.println(data +" ");
	}	
}
class DoublyLinkedList {

	Node first; 
	Node last; 
	DoublyLinkedList() {
		first = null;
		last = null; 
	}
	boolean isEmpty () { 
		return (first == null );
	}
	void insertFirst( int data) {
		Node newLink = new Node(data) ;
		
		if (isEmpty()) { 
			last = newLink ; 
		}
		else {			 
			first.previous  = newLink;
		}
		
		newLink.next = first; 
		first = newLink;			
	}
	void insertLast (int data)	{
		Node newLink = new Node(data);
		if (isEmpty()) { 
			first = newLink; 
		}
		else	{
			last.next = newLink; 
			newLink.previous = last; 
		}
		last = newLink;	
	}
	Node deleteFirst()	{	
		Node temp  = first; 
		if (first.next == null) { 
			last = null;			
		}
		else {
			first.next.previous = null;			
		}
		first= first.next; 
		return temp; 		
	}
	Node deleteLast()	{	
		Node temp  = last; 
		if (first.next == null) { 
			first = null;			
		}
		else {
			last.previous.next = null;			
		}
		last= last.previous ; 
		return temp; 		
	}
	boolean insertAfter(int key, int data ) { 
		
		Node current = first; 
		while (current.data != key )	{
			current = current.next ; 
			if (current == null)
				return false;
		}
		Node newLink = new Node(data);
		
		if (current == last)
		{
			newLink.next = null;
			last =newLink; 
		}
		else
		{
			newLink.next = current.next;
			current.next.previous = newLink; 
		}
		newLink.previous =current; 
		current.next = newLink; 
		return true; 
	}
	Node deleteKey(int key) {
		Node current = first;
		while (current.data != key)
		{
			current = current.next; 
			if (current ==null )
				return null;
		}
		if ( current == first ){
			first = current.next;
		}
		else {
			current.previous.next = current.next; 
		}
			
		if ( current == last ) { 
			last = current.previous;			
		}
		else { 
			current.next.previous = current.previous; 
		}
		return current;			
	}
	void displayForward()
	{
		System.out.println("first to last");
		Node current  = first;
		while (current != null ) { 
			current.displayLink();
			current = current.next; 
		}			
	}
	
	void displayBackward() {
		System.out.println("last to first");
		Node current  = last;
		while (current != null ) { 
			current.displayLink();
			current = current.previous  ; 
		}	
		
	}
	
}
