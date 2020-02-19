package linkedList;

public class DeleteMiddle {
	static Node head;	
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
	
	public static void deleteMiddle() {
		Node temp = head;
		Node temp1 =head.next;
		while(temp1.next !=null && temp1.next.next != null) {
			temp = temp.next;
			temp1= temp1.next.next;
		}
		temp.next =temp.next.next;
	}
	
	public static void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
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
		insert(10);
		deleteMiddle();
		print();
		
	}
}
