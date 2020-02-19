package linkedList;

public class Reversal extends LinkedList{

	static Node head;
	public static Node reversal3(Node curr , Node prev) {
		if(curr.next == null) {
			head = curr;
			curr.next = prev;
			return head;
		}
		Node next = curr.next;
		curr.next = prev;
		reversal3(next , curr);
		return head;
	}
	
	public static void reversal1(Node head) {
		if(head== null) {
			return;
		}
		else {
			reversal1(head.next);
			System.out.print(head.data+" ");
		}
	}
	public static Node reversal2(Node head) {
		Node prev = null;
		Node curr = head;
		Node next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	
	public static Node reversal4(Node curr, Node prev) {
		if(curr.next == null) {
			head = curr;
			curr.next = prev;
			return head;
		}
		Node next = curr.next;
		curr.next =prev;
		reversal4(next,curr);
		return head;
	}

	public static void main (String args[]) {
		head = insert(head,1);
		head = insert(head,2);
		head = insert(head,3);
		head = insert(head,4);
		head = insert(head,5);
		head = insert(head,6);
		head = insert(head,7);
		head = insert(head,8);
		//print(reversal2(head));
		print(reversal4(head,null));
	}
}
