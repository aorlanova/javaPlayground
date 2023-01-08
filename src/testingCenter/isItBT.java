package testingCenter;

/*Antonina Orlanova - Fall 2022 - Lab 12
 * The program checks if a tree is a binary search tree by traversing the tree in order.
 * If it is a BST, it will be a sorted output.
 * O(n) time complaxity (for loop + while loop)
 * O(n) space complexity (array + queue)
 */

import java.util.ArrayDeque;
import java.util.ArrayList;

import testingCenter.Traverse.Node;

public class isItBT {

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
	
	public static void inOrderTrav(Node rootNode) {
		
		ArrayDeque<Node> holdNode = new ArrayDeque<Node>();
		ArrayList<Integer> newAr = new ArrayList<Integer>();
		int i = 0;
		
		// begin by storing rootNode in holder
		Node holdRightLow = rootNode;
		
		// traverse the tree in order and add to the array.
        while(holdRightLow != null || holdNode.size() >0) {
        	
        	// traverse while holder != null
        	while(holdRightLow != null) {
        		
        		// push to queue and change left
        		holdNode.push(holdRightLow);
        		holdRightLow = holdRightLow.left;
 
        		
        	}
        	//hit null, pop and process
        	holdRightLow = holdNode.pop();
        	newAr.add(i,  holdRightLow.data);
        	i++;
        	// begin right traversal
        	holdRightLow = holdRightLow.right;
        }
		
        // check if the in order traversal is a sorted array
        for (int j = 1; j<newAr.size(); j++) {
        	System.out.println(newAr.get(j-1));
        	if(newAr.get(j) < newAr.get(j-1)) {
        		
        		
        		System.out.println("Not BST");
        		return;
        	
        	}
        	
        }
        System.out.println("BST");
		
	}

}
