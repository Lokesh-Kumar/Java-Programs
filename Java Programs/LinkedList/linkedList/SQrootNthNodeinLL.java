package linkedList;

public class SQrootNthNodeinLL extends LinkedList{
	static Node head;

	static int printsqrtn(Node head)  
	{  
	    Node sqrtn = null;  
	    int i = 1, j = 1;  
	      
	    // Traverse the list  
	    while (head != null)  
	    {  
	        // check if j = sqrt(i)  
	        if (i == j * j)  
	        {  
	            // for first node  
	            if (sqrtn == null)  
	                sqrtn = head;  
	            else
	                sqrtn = sqrtn.next;  
	              
	            // increment j if j = sqrt(i)  
	            j++;  
	        }  
	        i++;  
	          
	        head=head.next;  
	    }  
	      
	    // return node's data  
	    return sqrtn.data;  
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
		System.out.println(printsqrtn(head));
	}
}
