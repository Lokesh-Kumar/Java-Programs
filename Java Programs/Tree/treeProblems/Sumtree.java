package treeProblems;

public class Sumtree extends TreeTraversals {

	static Node root;
	
	public static int sumTree(Node root) {
		if(root.left ==null && root.right== null) {
			root.n = 0 ;
			return 0;
		}else {
			int sum =0;
			if(root.left !=null) {
				sum += root.left.n;
			}
			if(root.right !=null) {
				sum += root.right.n;
			}
			root.n = sum;
			if(root.left !=null) {
				root.n += sumTree(root.left);
			}
			if(root.right !=null) {
			root.n += sumTree(root.right);
			}
			return root.n;
		}
	}
	public static void main(String args[]) {
	    root = new Node(10); 
        root.left = new Node(-2); 
        root.right = new Node(6); 
        root.left.left = new Node(8); 
        root.left.right = new Node(-4); 
       // root.right.left = new Node(7); 
        root.right.right = new Node(5); 
        inOrderTraversal(root);
        sumTree(root);
        System.out.println();
        inOrderTraversal(root);
	}
}
