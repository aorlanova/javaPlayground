package testingCenter;

/*
 * Antonina Orlanova - Fall 2022 - Lab 12
 * DFS graph traversal
 */

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;

import testingCenter.IsItTree.Vertex;

public class Lab12 {
	
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
		
		dFS(g);
	

	}
	
	public static void dFS (Graph root) {
		// stack and hashset initialized
		ArrayDeque<Integer> stackVert = new ArrayDeque<Integer>();
	    HashSet<Integer> hashVert = new HashSet<Integer>();
	    // vertex holder
	    int holdVert = 0;
	    //push first vertex
	    stackVert.push(holdVert);
	    
	    while(stackVert.size() != 0) {
	    	
	    	// pop vertex into holder, print and add to hash set
	    	holdVert = stackVert.pop();
	    	System.out.println(holdVert);
	    	hashVert.add(holdVert);
	    	
	    	// for every edge of vertex
	    	for(int i = 0; i<root.adj[holdVert].size(); i++) {
	    		//check if the hashset contains neighbors(edges) if not, push to stack
	    		if(!hashVert.contains(root.adj[holdVert].get(i))) {
	    			
	    			stackVert.push(root.adj[holdVert].get(i));
	    	
	    	}
	    		
	    	
	    	}
	    	
	    	
	    }
	    
		
	}

	}
}