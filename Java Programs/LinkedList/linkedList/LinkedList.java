package linkedList;


class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}
public class LinkedList {
	static Node head;
	
	public static void insertBeg(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	public static int length(Node head) {
		Node temp = head;
		int n =0;
		while(temp!=null) {
			n++;
			temp = temp.next;
		}
		return n;
	}
	public static void insertPos(Node afNode, int data) {
		Node newNode = new Node(data);
		Node temp =head;
		while(temp.data != afNode.data) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
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
	
	public static Node insert (Node head, int data) {
		if(head == null) {
			head = new Node(data);			
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data) ;	
		}	
		return head;
	}
	
	public static void deleteLast() {
		Node temp = head;
		 while(temp.next.next != null) {
			 temp = temp.next;
		 }
		 temp.next = null;
	}
	
	public static void deletePos(Node pos) {
		Node temp = head;
		while(temp.data != pos.data) {
			temp = temp.next; 
		}
		temp.next = temp.next.next;
	}
	public static void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void print(Node temp) {
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
		insertBeg(7);
		insertBeg(8);
		insertPos(head.next.next.next,15);
		deleteLast();
		deletePos(head.next.next.next);
		print();
	}
}
