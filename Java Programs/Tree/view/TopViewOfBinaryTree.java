package view;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

import treeProblems.Node;

public class TopViewOfBinaryTree {
	static Node root;
	public static void topView(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		root.hd = 0;
		queue.add(root);
		TreeMap<Integer, Integer> tm = new TreeMap<Integer,Integer>();
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.n+" ");
			if(!tm.containsKey(node.hd))
				tm.put(node.hd,node.n);
			if(node.left != null) {
				node.left.hd = node.hd-1;
				queue.add(node.left);
			}
			if(node.right != null) {
				node.right.hd = node.hd+1;
				queue.add(node.right);
			}
		}
		System.out.println(tm.toString());
	}
	
	public static void main(String args[]) {
		root = new Node(20); 
		root.left = new Node(8); 
        root.right = new Node(22); 
        root.left.left = new Node(5); 
        root.left.right = new Node(3); 
        root.right.left = new Node(4); 
        root.right.right = new Node(25); 
        root.left.right.left = new Node(10); 
        root.left.right.right = new Node(14); 
        topView(root);
	}
}
