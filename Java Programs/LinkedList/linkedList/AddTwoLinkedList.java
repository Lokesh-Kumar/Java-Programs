package linkedList;

/*
 * The below program will not work because two linked list  with different lenght cannot be traversed simoultaneously so
 * The perfect way to do this is 
 * 	1. Reverse the linked list 
 *  2. Traverse and add the carry in the linked list with maximum length
 *  3. Print it 
 *  4. GFG Program given below
 * 
 */
public class AddTwoLinkedList extends LinkedList{
	static Node head1;
	static Node head2;
	
	public static int addTwoNumber(Node head1, Node head2) {
		if(head1.next==null && head2.next==null) {
			head1.data += head2.data;
			int carry = head1.data /10;
			head1.data = head1.data % 10;
			return carry;
		}
		else {
			int val = 0;
			if(head1.next.next!=null && head2.next.next==null) {
				val= addTwoNumber(head1.next, head2);
			}else if(head1.next.next==null && head2.next.next!=null) {
				val = addTwoNumber(head1,head2.next);
			}else if(head1.next.next!=null && head2.next.next!=null){
				val = addTwoNumber(head1.next,head2.next);
			}
				head1.data = head1.data + head2.data + val;
				int carry = head1.data /10;
				head1.data = head1.data %10;
				return carry;
			
		}
	}
	public static int getLength(Node head) {
		int length =0;
		while(head.next !=null) {
			length++;
			head= head.next;
		}
		return length;
	}
	public static void addLinkedList(Node head1, Node head2) {
		int l1 = getLength(head1);
		int l2 = getLength(head2);
		if(l1>l2) {
			System.out.println(addTwoNumber(head1, head2));
			LinkedList.print(head1);
		}else {
			System.out.println(addTwoNumber(head2, head1));
			LinkedList.print(head2);
		}
		
	}
	public static void main(String args[]) {
		head1 = insert(head1,9);
		head1 = insert(head1,1);
		head1 = insert(head1,8);
		head1 = insert(head1,4);
		
		head2 = insert(head2,5);
		head2 = insert(head2,6);
		head2 = insert(head2,3);
		//head2 = insert(head2,9);
		
		addLinkedList(head1,head2);
	}
}



/*
 * // Java implementation of the approach 
import java.util.*; 
class Node  
{ 
    int data; 
    Node next; 
      
    // constructor 
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
}// Node closes 
  
class LinkedList 
{ 
    Node head; 
      
    // Helper function to traverse 
    void traverse(Node head)  
    { 
        while(head != null) 
        { 
            System.out.print(head.data + "->"); 
            head = head.next; 
        } 
    } 
  
    // Helper function to insert data in linked list 
    void insert(int x) 
    { 
        Node temp = new Node(x); 
        if(head == null) head = temp; 
        else
        { 
            temp.next = head; 
            head = temp; 
        } 
    } 
  
    // Helper function to reverse the list 
    public static Node reverse(Node head) 
    { 
        if(head == null || head.next == null) return head; 
  
        Node prev = null; 
        Node curr = head; 
        while(curr != null) 
        { 
            Node temp = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = temp; 
        } 
        head = prev; 
        return head; 
    } 
      
    // Function to add two lists 
    public static Node sum(Node l1, Node l2) 
    { 
        if(l2 == null) return l1; 
        if(l1 == null) return l2; 
  
        // reverse l1 list 
        l1 = reverse(l1); 
  
        // reverse l2 list 
        l2 = reverse(l2); 
  
        // storing head whose reverse is to be returned 
        // This is where which will be final node 
        Node head = l1; 
        Node prev = null; 
        int c = 0,sum; 
        while(l1 != null && l2 != null) 
        { 
            sum = c + l1.data + l2.data; 
            l1.data = sum % 10; 
            c = sum / 10; 
            prev = l1; 
            l1 = l1.next; 
            l2 = l2.next; 
        } 
  
        if(l1 != null||l2 != null) 
        { 
            if(l2 != null) prev.next = l2; 
            l1 = prev.next; 
            while(l1 != null) 
            { 
                sum = c + l1.data; 
                l1.data = sum % 10; 
                c = sum / 10; 
                prev = l1; 
                l1 = l1.next; 
            } 
        } 
        if(c > 0) prev.next = new Node(c); 
        return reverse(head); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        LinkedList l1 = new LinkedList(); 
        l1.insert(3); 
        l1.insert(6); 
        l1.insert(5); 
        LinkedList l2 = new LinkedList(); 
        l2.insert(2); 
        l2.insert(4); 
        l2.insert(8); 
        LinkedList l3 = new LinkedList(); 
        Node head = sum(l1.head, l2.head); 
        l3.traverse(head); 
        System.out.print("Null"); 
    } 
} 
  
 */

