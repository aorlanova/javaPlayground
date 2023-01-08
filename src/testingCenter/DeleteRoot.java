package testingCenter;

import java.util.ArrayDeque;

/* Antonina Orlanova - Assignment 3 - Delete root node of array
 * Time complexity o(n) check if BST + find lowest of right tree
 * Space complexity - o(n) stack
 * 
 */

public class DeleteRoot {

	
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
		
		        // NOT a binary search tree
				Node mainRoot = new Node(4);
				mainRoot.left = new Node(100);
				mainRoot.right = new Node(6);
				mainRoot.left.left = new Node(1);
				mainRoot.left.right = new Node(3);
				mainRoot.right.right = new Node(7);
				mainRoot.right.left = new Node(5);
				inOrderTrav(mainRoot);
				// binary search tree
				Node mainRoot2 = new Node(4);
				mainRoot2.left = new Node(2);
				mainRoot2.right = new Node(6);
				mainRoot2.left.left = new Node(1);
				mainRoot2.left.right = new Node(3);
				mainRoot2.right.right = new Node(7);
				mainRoot2.right.left = new Node(5);
				inOrderTrav(mainRoot2);

	}
	
	public static void deleteRootNode(Node rootNode) {
		
		
		Node holdRightLow = rootNode.right;
		// replaces root node with the smallest value of the right half of binary search tree
		while (holdRightLow.left != null) {
			
			holdRightLow = holdRightLow.left;
			
		}
		
		rootNode.data = holdRightLow.data;
		
	}
	
	// in order traversal
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

}
