package treeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConstructBtfromGivenRepresentation extends TreeTraversals{
	
	public static Node constructBt(int parent[]) {

		ArrayList<Integer> arl = find(-1,parent);
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(arl.get(0));
		Node root = new Node(arl.get(0)); 
		while(!q.isEmpty()) {
			int val = q.poll();
			arl = find(val, parent);
			q.addAll(arl);
			addNode(root,val,arl);
			
		}
		return root;
	}
	
	public static void addNode(Node root, Node parent,ArrayList<Integer> arl) {
	  while(!arl.isEmpty()) {
		  
	  }
	}
	public static ArrayList<Integer> find(int val, int parent[]) {
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for(int i=0;i<parent.length;i++) {
			if(parent[i] == val) {
				arl.add(i);
			}
		}
		return arl;
	}
	public static void main(String args[]) {
		int parent[] = new int[]{-1, 0, 0, 1, 1, 3, 5}; 
		Node root = constructBt(parent);
		inOrderTraversal(root);
		
	}
}
