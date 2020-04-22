package treeProblems;

public class TreeTraversals {
	static Node root;
	
	public static void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		else {
			inOrderTraversal(root.left);
			System.out.print(root.n+" ");
			inOrderTraversal(root.right);
			
		}
	}
	public static void preOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		else {
			System.out.print(root.n+" ");			
			preOrderTraversal(root.left);	
			preOrderTraversal(root.right);
			
		}
	}
	public static void postOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		else {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.n+" ");
		}
	}
	
	public static void main(String arg[]) {
		
	    root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.left.right.left = new Node(6); 
        inOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
	}

}
