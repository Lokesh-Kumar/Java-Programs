package linkedList;

public class KthLastElement extends  LinkedList{
	static Node head;
	public static void findKthLastElement(Node head, int k) {
		Node temp = head;
		Node elem = head;
		while(temp!= null) {
			if(k==0) {
				elem = elem.next;
			}else {
				k--;
			}
			temp = temp.next;
		}
		System.out.println(elem.data);
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
		findKthLastElement(head, 5);
	}
}
