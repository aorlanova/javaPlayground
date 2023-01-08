package testingCenter;

import java.util.ArrayDeque;

/*Antonina Orlanova - Level Order Traversal Fall 2022 - Tues 3pm lab
 * O(N) space complexity when estimating
 * O(n) time complexity - every node is visited
 *  *
 */

public class Traverse {
	
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
	    // root node initialized
		Node mainRoot = new Node(4);
		mainRoot.left = new Node(2);
		mainRoot.right = new Node(6);
		mainRoot.left.left = new Node(1);
		mainRoot.left.right = new Node(3);
		mainRoot.right.right = new Node(7);
		mainRoot.right.left = new Node(5);
		// call level order traversal
		deleteRootNode(mainRoot);
		inOrderTrav(mainRoot);
		

	}
	
	public static void deleteRootNode(Node rootNode) {
		
		
		Node holdRightLow = rootNode.right;
		
		while (holdRightLow.left != null) {
			
			holdRightLow = holdRightLow.left;
			
		}
		
		rootNode.data = holdRightLow.data;
		
	}
	
	public static void inOrderTrav(Node rootNode) {
		
		ArrayDeque<Node> holdNode = new ArrayDeque<Node>();
		Node holdRightLow = rootNode;
		
        while(holdRightLow != null || holdNode.size() >0) {
        	
        	while(holdRightLow != null) {
        		
        		holdNode.push(holdRightLow);
        		holdRightLow = holdRightLow.left;
 
        		
        	}
        	
        	holdRightLow = holdNode.pop();
        	System.out.println(holdRightLow.data);
        	holdRightLow = holdRightLow.right;
        }
		
		
	}
	
	// takes argument of head root node that has no parent nodes
	public static void levelOrder(Node root) {
		// initialize queue
		ArrayDeque<Node> holdNode = new ArrayDeque<Node>();
		
		// enqueue head root node
		holdNode.add(root);
		// set next node to root
		Node nextNode = root;
		
		// Iterate until nextNode is null
		while(nextNode != null) {
			
			// set next node to head item of queue and process
			nextNode = holdNode.removeFirst();
			System.out.println(nextNode.data);
			
			//add left and right next nodes to queue if they are not null.
			if(nextNode.left != null) {
				
				holdNode.add(nextNode.left);
				
			}
			if(nextNode.right != null) {
				
				holdNode.add(nextNode.right);
				
			}
			
			
		}
		
		
	}

}
