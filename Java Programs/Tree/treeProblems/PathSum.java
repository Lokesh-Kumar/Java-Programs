package treeProblems;

import java.util.ArrayList;

public class PathSum {
	static Node root;
	
	public static void pathSum(Node root, int sum , ArrayList<Integer> arl) {
		if(root==null) {
			return;
		}else {
			
			if(sum-root.n==0) {
				System.out.println(arl.toString()+root.n);
			}else {
				arl.add(root.n);
				pathSum(root.left,sum-root.n,arl);
				pathSum(root.right,sum-root.n,arl);
				arl.remove(arl.size()-1);
			}
			
		}
	}
	public static void main(String args[]) {
		root = new Node(5); 
        root.left = new Node(4); 
        root.right = new Node(8); 
        root.left.left = new Node(11); 
        root.left.right = new Node(1); 
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2); 
        root.right.left = new Node(13);
        root.right.right = new Node(4); 
        root.right.right.left = new Node(5); 
        root.right.right.right = new Node(1); 
        pathSum(root,22,new ArrayList<Integer>());
	}

}
