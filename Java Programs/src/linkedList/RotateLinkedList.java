package linkedList;

public class RotateLinkedList  extends LinkedList{
	static Node head;
	public static Node rotate(Node head, int n) {
		Node temp = head;
		Node elem = null;
		Node lasthead = temp;
		int length = length(temp);
		if(n > length) {
			n=n%length;
		}
		System.out.println(n);
		while(temp.next!=null) {
			if(n>0) {
				elem = insert(elem,temp.data);
				lasthead = temp.next;
				n--;
			}
			temp = temp.next;
		}
		temp.next=elem;
		return lasthead;
	}
	public static void main(String args[]) {
		head = insert(head,1);
		head = insert(head,2);
		head = insert(head,3);
		head = insert(head,4);
		head = insert(head,5);
		head = insert(head,6);
		head = insert(head,7);
		head = rotate(head,9);
		print(head);
	}
}
