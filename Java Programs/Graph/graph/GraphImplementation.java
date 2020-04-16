package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph{
	//no of vertices
	int V;
	LinkedList<Integer> vArr[];
	
	Graph(int v){
		this.V = v;
		vArr = new LinkedList[V];
		for(int i=0;i<V;i++) {
			vArr[i] = new LinkedList<>(); 
		}
	}
	
	public static void addEdge(Graph graph, int src, int dest) {
		//Add to the List
		graph.vArr[src].add(dest);
		// Since graph is undirected, add an edge from dest 
        // to src also 
		graph.vArr[dest].add(src);
		
	}
	
	public static void addEdgeDirected(Graph graph, int src, int dest) {
		//Add to the List
		graph.vArr[src].add(dest);
		// Since graph is undirected, add an edge from dest 
        // to src also 
	//	graph.vArr[dest].add(src);
		
	}
	public static void printGraph(Graph graph) {
		for(int i=0;i<graph.V;i++) {
			System.out.print(i+" : ");
			for(Integer val:graph.vArr[i]) {
				System.out.print("->"+val);
			}
			System.out.println();
		}
	}
	
	public static void BFS(Graph graph ,int start) {
		boolean visited[] = new boolean[graph.V];
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		visited[start]=true;
		while(!q.isEmpty()) {
			int i =q.poll();
			System.out.print(i+" ");
			Iterator<Integer> it = graph.vArr[i].listIterator();
			// Get all adjacent vertices of the dequeued vertex s 
            // If a adjacent has not been visited, then mark it 
            // visited and enqueue it 
			while(it.hasNext()) {
				int x = it.next();
				if(!visited[x]) {
					q.add(x);
					visited[x]=true;
				}
			}
					
		}
		
	}
	public static void DFSUtil(Graph graph, boolean visited[], int curr) {
		visited[curr] = true;
		System.out.print("->"+curr);
		Iterator<Integer> it = graph.vArr[curr].listIterator();
		while(it.hasNext()) {
			int x = it.next();
			if(!visited[x])
				DFSUtil(graph,visited,x);
		}
	}
	public static void DFS(Graph graph, int start) {
		boolean visited[] = new boolean[graph.V];
		DFSUtil(graph, visited, start);
 
	}
	
}
public class GraphImplementation extends Graph{

	
	GraphImplementation(int v) {
		super(v);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		int v=5;
		Graph graph = new Graph(v);
		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
        printGraph(graph);
        System.out.println("BFS: ");	BFS(graph,0);
        System.out.println("DFS: ");	DFS(graph,0);
	}
}
