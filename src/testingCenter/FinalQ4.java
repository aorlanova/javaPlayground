package testingCenter;

import java.util.ArrayDeque;
import java.util.ArrayList;

import testingCenter.Traverse.Node;

public class FinalQ4 {
	
	// node class, static because is not an object of class traverse
	static class Node {
		int data;
		Node left, right;
		// constructor, default pointers to left right are null, data is a parameter
		public Node(int item)
		{
		data = item;
		left = null;
		right = null;
		
		}
		
	}

	public static void main(String[] args) {
		
		Node mainRoot = new Node(4);
		mainRoot.left = new Node(2);
		mainRoot.right = new Node(6);
		mainRoot.left.left = new Node(1);
		mainRoot.left.right = new Node(3);
		mainRoot.right.right = new Node(7);
		mainRoot.right.left = new Node(5);
		
		// third smallest node is 3.
		// should be the third visited node in in-order traversal
		
		inOrder(mainRoot);

	}
	
	public static void inOrder(Node root) {
		
		ArrayDeque<Node> holdNode = new ArrayDeque<Node>();
		ArrayList<Integer> newAr = new ArrayList<Integer>();
		int i = 0;
		int counter = 0;
		
		// begin by storing rootNode in holder
		Node holdRightLow = root;
		
		// traverse the tree in order and add to the array.
        while(holdRightLow != null || holdNode.size() >0) {
        	
        	// traverse while holder != null
        	while(holdRightLow != null) {
        		
        		// push to queue and change left
        		holdNode.push(holdRightLow);
        		holdRightLow = holdRightLow.left;
 
        		
        	}
        	
        	//hit null, pop and 'process' (processing here is checking if third node hit)
        	holdRightLow = holdNode.pop();
        	if(counter == 2) {
        		
        		System.out.println("Here is the third largest number: " + holdRightLow.data);
        		
        	}
        	// begin right traversal
        	holdRightLow = holdRightLow.right;
        	counter++;
        }
		
		
	}

}
