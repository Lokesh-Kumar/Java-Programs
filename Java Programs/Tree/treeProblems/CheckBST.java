package treeProblems;

public class CheckBST extends TreeTraversals {

	static Node root;
	static boolean isBST()  { 
	        return isBSTUtil(root, Integer.MIN_VALUE, 
	                               Integer.MAX_VALUE); 
	    } 
	  
	    /* Returns true if the given tree is a BST and its 
	      values are >= min and <= max. */
	static  boolean isBSTUtil(Node node, int min, int max) 
	    { 
	        /* an empty tree is BST */
	        if (node == null) 
	            return true; 
	  
	        /* false if this node violates the min/max constraints */
	        if (node.n < min || node.n > max) 
	            return false; 
	  
	        /* otherwise check the subtrees recursively 
	        tightening the min/max constraints */
	        // Allow only distinct values 
	        return (isBSTUtil(node.left, min, node.n-1) && 
	                isBSTUtil(node.right, node.n+1, max)); 
	    } 
	public static void main(String args[]) {
		root = new Node(20); 
        root.left = new Node(10); 
        root.right = new Node(40); 
        root.left.left = new Node(5); 
        root.left.right = new Node(15); 
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(7); 
        root.right.left = new Node(30);
        root.right.right = new Node(50); 
        root.right.right.left = new Node(45); 
        root.right.right.right = new Node(60); 
        inOrderTraversal(root);
        System.out.println(isBST());
	}
}
