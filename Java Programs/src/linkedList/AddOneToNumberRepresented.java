package linkedList;

import java.awt.print.Printable;

/*
 * Add 1 to a number represented as linked list
Number is represented in linked list such that each digit corresponds to a node in linked list. 
Add 1 to it. 
For example 1999 is represented as (1-> 9-> 9 -> 9) and adding 1 to it should change it to (2->0->0->0)
 */
public class AddOneToNumberRepresented extends LinkedList {
	static Node head;
	

	public static int addOne(Node head) {
		if(head.next == null) {
			head.data = head.data + 1;
			int rem = head.data /10;
			head.data = head.data % 10;
			return rem;
		}else {
			return head.data = head.data + addOne(head.next);
		}
	}
	public static void main(String args[]) {
		head = insert(head,1);
		head = insert(head,9);
		head = insert(head,9);
		head = insert(head,9);
		print(head);
		addOne(head);
		print(head);
	}
}
