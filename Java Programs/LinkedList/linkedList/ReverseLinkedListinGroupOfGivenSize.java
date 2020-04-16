package linkedList;

public class ReverseLinkedListinGroupOfGivenSize extends LinkedList{

	static Node head;
	
	public static Node reverse(Node curr_head, int N) {

		Node prev = null;
		Node curr = curr_head;
		Node next;
		while (curr!=null && N!=0){
			next =curr.next;
			curr.next =prev;
			prev=curr;
			curr=next;
			N--;
		}
		head = prev;
		return head;
	}
	public static Node reversalGroup(Node head,int n) {
			Node beg = head;
			Node temp = head;
			Node new_head = null;
			int i = n;
			while(temp!=null) {
				temp = temp.next;
				i--;
				if(i==1) {
					while(new_head!=null) {
						new_head = new_head.next;
					}
					new_head = reverse(beg,n);
					i=n;
				}
			}
			return new_head;
	}
		
	public static void main(String args[]) {
		int N =4;
		head = insert(head,1);
		head = insert(head,2);
		head = insert(head,2);
		head = insert(head,4);
		head = insert(head,5);
		head = insert(head,6);
		head = insert(head,7);
		head = insert(head,8);
		//print(reversal2(head));
		print(reversalGroup(head,N));
	}
}
