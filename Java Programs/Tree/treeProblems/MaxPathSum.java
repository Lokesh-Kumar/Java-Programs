package treeProblems;
/*
 * Iterate through the tree and find the maximum sum
 */
public class MaxPathSum {
	static Node root;
	static int sum;
	public static int findMaxPathSum(Node root) {
		if(root == null) {
			return 0;
		}else {
			int l = findMaxPathSum(root.left);
			int r = findMaxPathSum(root.right);
			int max = Math.max(Math.max(l, r)+root.n,root.n);
			int rootmax = Math.max(max, root.n+l+r);
			sum = Math.max(sum, rootmax);
			return max;
		}
	}
	public static void main(String args[]) {
	    root = new Node(11); 
        root.left = new Node(2); 
        root.right = new Node(10); 
        root.left.left = new Node(20); 
        root.left.right = new Node(1); 
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);
        MaxPathSum m = new MaxPathSum();
        m.sum = Integer.MIN_VALUE;
		System.out.println(findMaxPathSum(root));
		System.out.println(sum);
	}
}
