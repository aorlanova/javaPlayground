package testingCenter;

/*
 * Antonina Orlanova - Fall 2022 - Lab 13
 * BFS graph traversal
 */

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class Lab13 {

	static class Graph
	{
	int V; //Number of Vertices
	LinkedList<Integer>[] adj; // adjacency lists
	//Constructor
	Graph(int V)
	{
	this.V = V;
	adj = new LinkedList[V];
	for (int i = 0; i < adj.length; i++)
	adj[i] = new LinkedList<Integer>();
	}
	//To add an edge to graph
	
	void addEdge(int v, int w) {
	  adj[v].add(w); // Add w to the list of v.
	}


	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);
		g.addEdge(1, 3);
		g.addEdge(3, 5);
		
		bFS(g);
	

	}
	
	public static void bFS (Graph root) {
		// queue and hashset initialized
		ArrayDeque<Integer> queueVert = new ArrayDeque<Integer>();
	    HashSet<Integer> hashVert = new HashSet<Integer>();
	    // vertex holder
	    int holdVert = 0;
	    //queue first vertex
	    queueVert.add(holdVert);
	    
	    while(queueVert.size() != 0) {
	    	
	    	// pop vertex into holder, print and add to hash set
	    	holdVert = queueVert.removeFirst();
	    	System.out.println(holdVert);
	    	hashVert.add(holdVert);
	    	
	    	// for every edge of vertex
	    	for(int i = 0; i<root.adj[holdVert].size(); i++) {
	    		//check if the hashset contains neighbors(edges) if not, push to stack
	    		if(!hashVert.contains(root.adj[holdVert].get(i))) {
	    			
	    			queueVert.add(root.adj[holdVert].get(i));
	    	
	    	}
	    		
	    	
	    	}
	    	
	    	
	    }
	    
		
	}

	}

}
