package treeProblems;
/*
 * Other Solution is to Use Queue and convert it into a mirror
 */
public class ConvertToMirrorTree extends TreeTraversals{
	public static Node root;
	public static void mirror(Node root) {
		if(root== null) {
			return;
		}else {
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
			mirror(root.left);
			mirror(root.right);
		}
	}
	public static void main(String args[]) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		inOrderTraversal(root);
		mirror(root);
		System.out.println();
		inOrderTraversal(root);
	}
}
