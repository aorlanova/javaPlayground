package testingCenter;


public class FinalQ3 {
	
	// first element in class
	Node head;
	
	// constructor
	static class Node {
		
		// value of the node
		int data;
		//next value constructed
		Node next = null;
		
		
		// passing new node by value
		 Node (int value){
			
			data = value;
			next = null;
			
			
		}
		
	}

	public static void main(String[] args) {
		
		Node headOne = new Node(2);
		headOne.next = new Node(3);
		headOne.next.next = new Node(1);
		headOne.next.next.next = new Node(7);
		headOne.next.next.next.next = new Node(5);
		headOne.next.next.next.next.next = new Node(18);
		rmThirdLast(headOne);
		//strategy: pointer that is four nodes behind. Will point to the node after the third to last node when fast pointer hits null.
	}
	
	
	public static void rmThirdLast(Node head) {
		//strategy: pointer that is four nodes behind. Will point to the node after the third to last node when fast pointer hits null.
		
		//behind third to last node.
		Node slowNode = null;
		//normal LL traversal
		Node fastHolder = head;
		//extra holder
		Node holder = null;
		int counter = 0;
		while(fastHolder.next != null) {
			
			
			//when slowNode isn't equal to anything
			if(slowNode == null) {
				
				slowNode = fastHolder;
				//counter resets, will move again when normal pointer moves three
				counter = 0;
				
			} if (counter >= 3) {
				
				slowNode = slowNode.next;
				
				
			}
			// increment fastHolder and counter
			fastHolder = fastHolder.next;
			counter++;
			
			if(fastHolder.next == null) {
				
				// what slowNode should point to is in holder.
				holder = slowNode.next.next;
				//skip third to last Node.
				slowNode.next = holder;
				
			}
		}
		//print to check
		printLL(head);
		
	}
	
	public static void printLL(Node head) {
		
		while(head != null) {
			
			
			System.out.println(head.data);
			head = head.next;
			
			
		}
		
		
	}
	

}
