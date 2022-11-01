package testingCenter;

public class ReverseLinkedList {
	
    public static void main(String[] args) {
		
		Node firstOne = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		firstOne.setNextNode(second);
		second.setNextNode(third);
		third.setNextNode(null);
		printLinked(firstOne);
		reverseLinked(firstOne);
		printLinked(firstOne);
		
		
	}

	public static class Node {

		  public int data;
		  private Node next;

		  public Node(int data) {
		    this.data = data;
		    this.next = null;
		  }

		  public void setNextNode(Node node) {
		    this.next = node;
		  }

		  public Node getNextNode() {
		    return this.next;
		  }
		  

		}
	
    public static Node hold = new Node(0);
	public static Node prev = new Node(0);
	public static void reverseLinked(Node headNode) {
		
		int counter = 0;
		Node current = new Node(0);
		
		while(headNode.getNextNode() != null) {
			
			if (counter == 0) {
				
				prev = headNode;
				current = headNode.getNextNode();
				hold = new Node(headNode.data);
				current.setNextNode(null);
				
				current = headNode.getNextNode();
				counter++;
				
			} else {
				
				
				hold = new Node(headNode.data);
				headNode.setNextNode(prev);
				headNode.getNextNode().setNextNode(hold);
				prev = headNode;
				
			}
			
			
			
		}
		
		
		
	}
	
	public static void printLinked(Node headNode) {
		Node current = headNode;
		
		while (headNode.getNextNode() != null) {
				
				System.out.println(current.data);
				current = current.getNextNode();
				
				
			}
			
			
		}
		
		
	}
	


