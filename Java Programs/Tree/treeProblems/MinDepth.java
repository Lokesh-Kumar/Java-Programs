package treeProblems;

public class MinDepth {
	static Node root;

	public static int minDepth(Node root) {
		if (root == null) {
			return 0;
		} else {
			int l = minDepth(root.left);
			int r = minDepth(root.right);
			return (l <= r) ? l + 1 : r + 1;
		}
	}

	public static void main(String args[]) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(3); 
		root.left.right = new Node(3);
		root.right.left=new Node(3);
		root.right.right=new Node(3);
		root.left.left.left = new Node(4);
		root.left.left.right = new Node(4);
		

		System.out.println(minDepth(root));
	}
}
