package linkedList;

public class FindMiddle extends LinkedList{
	static Node head;

	public static void findMiddle() {
		if(head !=null) {
			Node temp = head;
			Node temp1 = head;
			while(temp1.next != null && temp1.next.next !=null) {
				temp = temp.next;
				temp1 = temp1.next.next;
			}
			System.out.println(temp.data);
		}
	}
	public static void insert(int data) {
		if(head == null) {
			head = new Node(data);			
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data) ;	
		}	
	}
	public static void main(String args[]) {
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		insert(7);
		insert(8);
		insert(9);
		findMiddle();
	}
}
