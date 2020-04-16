package graph;

import java.util.Iterator;
import java.util.Stack;

public class TopologicalSort extends Graph{

	TopologicalSort(int v) {
		super(v);
		// TODO Auto-generated constructor stub
	}
	
	public static void sort(Graph gh,int ele, boolean visited[],Stack stack) {
		
		visited[ele] = true;
		Iterator it = gh.vArr[ele].iterator();
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			if(!visited[i])
				sort(gh,i,visited,stack);
		}
		stack.add(ele);
		
	}
	public static void topologicalSort(Graph gh, int V) {
		
		Stack stack = new Stack(); 
		boolean visited[] = new boolean[6];
		 for (int i = 0; i < V; i++) 
	            visited[i] = false; 
		 for(int i=0;i<V;i++) {
			 if(!visited[i])
				 sort(gh,i,visited,stack);
		 }
		 while (stack.empty()==false) 
	            System.out.print(stack.pop() + " "); 
		 
	}
	public static void main(String args[]) {
		Graph gh = new Graph(6);
		gh.addEdgeDirected(gh, 5, 0);
		gh.addEdgeDirected(gh, 5, 2);
		gh.addEdgeDirected(gh, 4, 0);
		gh.addEdgeDirected(gh, 2, 3);
		gh.addEdgeDirected(gh, 3, 1);
		gh.addEdgeDirected(gh, 4, 1);
		printGraph(gh);
		topologicalSort(gh, 6);
		
	}

}
