package testingCenter;

import testingCenter.DeleteRoot.Node;
import java.util.*;

public class IsItTree {

	// node class, static because is not an object of class traverse
			static class Vertex {
				int data;
				Vertex edge;
				
				// constructor, default pointers to left right are null, data is a parameter
				public Vertex(int item)
				{
				data = item;
				edge = null;
				
				}
				
			}
	
	public static void main(String[] args) {
		
		Vertex A = new Vertex(1);
		Vertex B = new Vertex(2);
		Vertex C = new Vertex (3);
		Vertex D = new Vertex(4);
		Vertex E = new Vertex(5);

		A.edge = B;
		A.edge.edge = C;
		A.edge.edge.edge = D;
		B.edge = A;
		C.edge = A;
		D.edge = D;
		B.edge = E;
		
		dFS(A);
	}
	
	public static void dFS (Vertex root) {
		
		Vertex holdVertex = root;
		Vertex multiEdgeHold = new Vertex(-1);
		//Vertex prev = new Vertex(-1);
	    ArrayDeque<Vertex> stackVert = new ArrayDeque<Vertex>();
	    HashSet<Vertex> hashVert = new HashSet<Vertex>();
	    stackVert.push(holdVertex);
	    
	    while(stackVert.size() != 0) {
	    	
	    	holdVertex = stackVert.pop();
	    	System.out.println(holdVertex.data);
	    	hashVert.add(holdVertex);
	    	multiEdgeHold = holdVertex.edge;
	        
	    	while(multiEdgeHold.edge.data != -1) {
	    	
	    	  if (!hashVert.contains(holdVertex.edge)) {
	    		
	    		stackVert.push(holdVertex.edge);
	    		
	    	  }
	    	  
	    	}
	    	hashVert.add(holdVertex.edge);
	    	
	    }
	    
		
		
	}

}
