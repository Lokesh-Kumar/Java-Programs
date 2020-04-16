package treeProblems;

public class LeftToRight {
	public static Node root;
	
	public static void printLeft(Node root) {
		if(root==null) {
			return;
		}else {
			printLeft(root.left);
			System.out.println(root.n);
		}
	}
	public static void printRight(Node root) {
		if(root==null) {
			return;
		}else {
			System.out.println(root.n);
			printRight(root.right);
		}
	}
	public static void printLefttoRight(Node root) {
		printLeft(root);
		printRight(root);
	}
	public static void main(String args[]) {
		root = new Node(5); 
        root.left = new Node(2); 
        root.right = new Node(6); 
        root.left.left = new Node(1); 
        root.left.right = new Node(4); 
        root.right.right = new Node(7); 
        root.right.right.right = new Node(8); 
        printLefttoRight(root);
	}
}
