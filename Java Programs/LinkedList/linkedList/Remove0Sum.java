package linkedList;

/*
 * Given some resources in the form of linked list you have to canceled out all the
 *  resources whose sum up to 0(Zero) and return the remaining list.

 * Test 0
original: {6, -6, 8, 4, -12, 9, 8, -8}
canceled out: {9}

Test 1
original: {4, 6, -10, 8, 9, 10, -19, 10, -18, 20, 25}
canceled out: {20, 25}
 */
class StackNode{
	int data;
	StackNode next;
	StackNode(int data){
		this.data = data;
		this.next = null;
	}
}
public class Remove0Sum {
	static Node head;
	static StackNode top;
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
	
	public static StackNode push(StackNode top,int data) {
		if(top == null) {
			top = new StackNode(data);
		}
		else {
			StackNode temp = new StackNode(data);
			temp.next = top;
			top = temp;
		}
		return top;
	}
	public static void printStack(StackNode top) {
		if(top == null) {
			return;
		}
		else {
			printStack(top.next);
			System.out.print(top.data+" ");
		}
	}
	public static void removeZeroSum() {
		Node temp = head;
		StackNode ttop = null;
		while(temp!=null) {
			ttop = push(ttop,temp.data);
			StackNode ltop = ttop;
			int sum = 0;
			while(ltop!=null) {
				sum += ltop.data;
				if(sum == 0) {
					ttop = ltop.next;
				}
				ltop =ltop.next;
			}
			temp = temp.next;
		}
		printStack(ttop);
	}

	public static void main(String args[]) {
		insert(4);
		insert(6);
		insert(-10);
		insert(8);
		insert(9);
		insert(10);
		insert(-19);
		insert(10);
		insert(-18);
		insert(20);
		insert(25);
		removeZeroSum();
		
	}
}
