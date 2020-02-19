package linkedList;

import java.util.HashSet;
/*
 *  https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
 */

public class DetectLoop extends LinkedList{

	static Node head;
	// Check using HashSet
	public static boolean detectLoop(Node head) {
		boolean isPresent = false;
		Node temp  = head;
		HashSet <Node> set = new HashSet<Node>();
		while(temp != null) {
			if(set.contains(temp)) {
				isPresent = true;
				break;
			}else {
				set.add(temp);
			}
			temp = temp.next;
		}
		return isPresent;
	}
	// Use Floyd's Cycle detection method ot find ifthere is a loop
	public static void detectFLoop(Node head) {
		
	}
	
	/*
	 * 1. Iterate the head 
	 * 2. Iterate the loop variable and check if it matches the head variable
	 * 3. If it matches then remove the loop	
	 */
	public static void removeLoop(Node head, Node loop) {
		
	}
	
	/*
	 * 1. Use hashSet to find the duplicate
	 */
	public static void removeLoop1(Node head) {
		
	}
	/*
	 *1. Find the meeting point of slow and fast pointer 
	 *2. Iterate from head and fast pointer in speed 1 
	 *3. The meeting point will be the starting of the loop 
	 */
	public static void removeLoop2(Node head) {
		
	}
	public static void main(String args[]) {
		head = insert(head,1);
		head = insert(head,2);
		head = insert(head,3);
		head = insert(head,4);
		head = insert(head,5);
		head = insert(head,6);
		head = insert(head,7);
		head = insert(head,8);
		head = insert(head,9);
		head = insert(head,10);
	//	head.next.next.next.next.next.next.next.next.next.next = head.next.next;
		System.out.println(detectLoop(head));
	}
}
