package LinkedListDel;

class LinkedListDel
{
	 Node head; 
	
	 class Node	 {
	     int data;
	     Node next;
	     Node(int d)    {
	         data = d;
	         next = null;
	     }
	 }
 
	 void deleteNode(int key)	 {     
		 Node temp = head, prev = null;

		 if (temp != null && temp.data == key)     {
			 head = temp.next; 
			 return;
		 }     
     
		 while (temp != null && temp.data != key)  {
			 prev = temp;
			 temp = temp.next;
		 }
     
		 if (temp == null) return;    
		 prev.next = temp.next;
	 }
	 public void push(int new_data) {
	     Node new_node = new Node(new_data);
	     new_node.next = head;
	     head = new_node;
	 }
	 public void printList() {
	     Node tnode = head;
	     while (tnode != null)     {
	         System.out.print(tnode.data+" ");
	         tnode = tnode.next;
	     }
	 }
	 void deleteNodePos(int position)    {	        
	        if (head == null)
	            return;
	        Node temp = head;
	        if (position == 0)     {
	            head = temp.next;  
	            return;
	        } 
	        
	        for (int i=0; temp!=null && i<position-1; i++)
	            temp = temp.next;
	         
	        if (temp == null || temp.next == null)
	            return;
	 
	        Node next = temp.next.next;	 
	        temp.next = next;  
	 }
	 void reverse() {
	        Node prev = null;
	        Node node = head; 
	        Node current = node;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        head = node; 
	 }
}