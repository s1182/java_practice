package LinkedLists;

public class LinkedListDemo
{
	public static void main(String[] args)
	{
	     LinkedList llist = new LinkedList();
	     llist.append(6);
	     llist.push(7);
	     llist.push(1);
	     llist.append(4);
	     llist.insertAfter(llist.head.next, 8);
	     System.out.println("\nCreated Linked list is: ");
	     llist.printList();
	 }
}

