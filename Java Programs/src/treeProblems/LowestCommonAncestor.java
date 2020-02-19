package treeProblems;

/*
 * 
LCA of 10 and 14 is 12
LCA of 14 and 8 is 8
LCA of 10 and 22 is 20
 */
public class LowestCommonAncestor extends TreeTraversals{
	static Node root;
	public static Node lowestCommonAncestor(Node root, int n1, int n2) {
		if(root==null) {
			return null;
		}else {
			if(n1<root.n && n2<root.n) {
			root = 	lowestCommonAncestor(root.left, n1, n2);
			}
			if(n1>root.n && n2>root.n) {
			root =	lowestCommonAncestor(root.right, n1, n2);
			}
			return root;
		}
	}
	public static void main(String args[]) {
	    root = new Node(20); 
	    root.left = new Node(8); 
	    root.right = new Node(22); 
	    root.left.left = new Node(4); 
	    root.left.right = new Node(12); 
	    root.left.right.left = new Node(10); 
	    root.left.right.right = new Node(14); 
	   // inOrderTraversal(root);
	    System.out.println(lowestCommonAncestor(root,10,14).n);
	}
}
