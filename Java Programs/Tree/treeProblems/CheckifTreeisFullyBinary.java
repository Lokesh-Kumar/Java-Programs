package treeProblems;

/*
 * Fully Binary Tree:	a binary tree T is full if
						each node is either a leaf or
						possesses exactly two child
						nodes.
 * 
 * Complete Binary Tree: a binary tree T with n
e						levels is complete if all
						levels except possibly the
						last are completely full,
						and the last level has all its
						nodes to the left side.
 */
public class CheckifTreeisFullyBinary {
	static Node root;
	public static boolean checkFullyBinaryTree(Node root) {
		if((root.left != null && root.right == null) || (root.left == null && root.right != null)) {
			return false;
		}
		else if(root.left == null && root.right == null) {
			return true;
		}else {
			return checkFullyBinaryTree(root.left) && checkFullyBinaryTree(root.right);
		}
	}
	public static void main(String args[]) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		root.left.right = new Node(55);
		root.left.left = new Node(34);
		System.out.println(checkFullyBinaryTree(root));
	}
}
