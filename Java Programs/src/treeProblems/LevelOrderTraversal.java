package treeProblems;

import java.util.LinkedList;
import java.util.Queue;
/*
 * Level order traversal of a tree is implemented using queue
 */
public class LevelOrderTraversal {
	static Node root;
	
	public static void printGivenLevel(Node root, int level) {
		if(root == null) {
			return;
		}else if (level == 1) {
			System.out.print(root.n+" ");
		}
		printGivenLevel(root.left, level-1);
		printGivenLevel(root.right, level-1);
	}
	
	public static void traverseLevels(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.n+" ");
			if(node.left != null) {
				queue.add(node.left);
			}
			if(node.right != null) {
				queue.add(node.right);
			}
		}
	}
	public static void main(String args[]) {
		root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(4); 
        root.left.left = new Node(3); 
        root.left.left.right = new Node(7); 
        root.left.right = new Node(5); 
        root.left.right.left = new Node(6); 
        //printGivenLevel(root,3);
        traverseLevels(root);
	}
}
