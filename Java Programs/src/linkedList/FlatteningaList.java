package linkedList;
/*
 * Given a linked list where every node represents a linked list and contains two pointers of its type:
(i) Pointer to next node in the main list (we call it ‘right’ pointer in below code)
(ii) Pointer to a linked list where this node is head (we call it ‘down’ pointer in below code).
All linked lists are sorted. See the following example

       5 -> 10 -> 19 -> 28
       |    |     |     |
       V    V     V     V
       7    20    22    35
       |          |     |
       V          V     V
       8          50    40
       |                |
       V                V
       30               45
Write a function flatten() to flatten the lists into a single linked list. The flattened linked list should also be sorted. For example, for the above input list, output list should be 5->7->8->10->19->20->22->28->30->35->40->45->50.
 */

class NodeM{
	int data;
	NodeM right;
	NodeM down;
	NodeM(int data){
		this.data = data;
		right = down = null;
	}
}
public class FlatteningaList {
	static NodeM head;
	public static void flatten1() {
		NodeM temp = head;
		while( temp.right != null || temp.down != null) {
			if(temp.down != null) {
				temp.down.right =temp.right;
				temp.right =temp.down;
				temp = temp.right;
			} else if(temp.right != null){
				temp = temp.right;
			}
		}
	}
	static NodeM push(NodeM head_ref, int data) 
    { 
	    NodeM new_node = new NodeM(data); 
        new_node.down = head_ref; 
        head_ref = new_node; 
	    return head_ref; 
    } 
	public static void print() {
		NodeM temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.right;
		}
	}
	public static void main(String args[]) {
		head = push(head, 30); 
        head = push(head, 8); 
        head = push(head, 7); 
        head = push(head, 5); 
  
        head.right = push(head.right, 20); 
        head.right = push(head.right, 10); 
  
        head.right.right = push(head.right.right, 50); 
        head.right.right = push(head.right.right, 22); 
        head.right.right = push(head.right.right, 19); 
  
        head.right.right.right = push(head.right.right.right, 45); 
        head.right.right.right = push(head.right.right.right, 40); 
        head.right.right.right = push(head.right.right.right, 35); 
        head.right.right.right = push(head.right.right.right, 28); 
        
        flatten1();
        print();
  
	}
}
