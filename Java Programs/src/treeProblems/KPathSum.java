package treeProblems;

import java.util.ArrayList;
/*
 *  Find the path of the sum between any nodes which is equal to the current node
 *  
 * 1. Similar to The problem Path Sum
 * 2. Store the path in ArrayList
 * 3. On each level check the Sum from the array list if it is equal(IN REVERSE ORDER)
 */
public class KPathSum {
	static Node root;
	static ArrayList<Integer> path = new ArrayList<Integer>();
	public static void KpathSum(Node root, int sum ) {
		if(root==null) {
			return;
		}else {
			path.add(root.n);
			KpathSum(root.left,sum);
			KpathSum(root.right,sum);
			int f=0;
			    for (int j = path.size() - 1; j >= 0; j--)  
			    {  
			        f += path.get(j);  
			  
			        // If path sum is k, print the path  
			        if (f == sum)  
			            print(path, j);  
			    }  
			  
			    // Remove the current element from the path  
			    path.remove(path.size() - 1);  
			
		}
	}

	public static void print(ArrayList<Integer> arl,int x) {
		for (int j = x; j < arl.size(); j++)  
	        System.out.print( arl.get(j) + " ");  
	        System.out.println();  
	}
	public static void main(String args[]) {
		 Node root = new Node(1);  
		    root.left = new Node(3);  
		    root.left.left = new Node(2);  
		    root.left.right = new Node(1);  
		    root.left.right.left = new Node(1);  
		    root.right = new Node(-1);  
		    root.right.left = new Node(4);  
		    root.right.left.left = new Node(1);  
		    root.right.left.right = new Node(2);  
		    root.right.right = new Node(5);  
		    root.right.right.right = new Node(2);
        KpathSum(root,5);
	}
}
