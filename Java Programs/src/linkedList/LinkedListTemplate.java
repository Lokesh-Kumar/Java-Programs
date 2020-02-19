package linkedList;

public class LinkedListTemplate extends LinkedList {
	static Node head;
	public static void main(String args[]) {
		head = insert(head,1);
		head = insert(head,2);
		head = insert(head,3);
		head = insert(head,4);
		head = insert(head,5);
		head = insert(head,6);
		head = insert(head,7);
		print(head);
	}

}
