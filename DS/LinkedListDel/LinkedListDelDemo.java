package LinkedListDel;

public class LinkedListDelDemo {

	public static void main(String[] args)
	 {
	     LinkedListDel llist = new LinkedListDel();

	     llist.push(7);
	     llist.push(1);
	     llist.push(3);
	     llist.push(2);

	     System.out.println("\nCreated Linked list is:");
	     llist.printList();

	     llist.deleteNode(1); 

	     System.out.println("\nLinked List after Deletion key 1");
	     llist.printList();
	     
	     
	     llist.deleteNodePos(2); 

	     System.out.println("\nLinked List after Deletion Pos 2");
	     llist.printList();
	     
	     llist.push(22);
	     llist.push(33);
	     System.out.println("\nLinked List after addition");
	     llist.printList();
	     
	     llist.reverse(); 
	     System.out.println("\nReversed Linked List ");
	     llist.printList();
	     
	     
	     
	     
	     
	 }
}


