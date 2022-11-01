package testingCenter;

/*Antonina Orlanova - Lab 7 - Tues 3pm - Fall 2022
 *
 *Creating linked list class from scratch
 *
 * */
 


import java.io.*;
// main method
public class LinkedListClass {
	
	public static void main(String[] args) {
		
		// create linked list 
		LinkedListClass test1 = new LinkedListClass();
		// append values to existing list
		insert(50, test1);
		insert(11, test1);
		insert(31, test1);
		insert(21, test1);
		insert(40, test1);
		insert(71, test1);
		
		// print list
		printList(test1);
		
		
	}
	
	// first element in class
	Node head;
	
	// constructor
	static class Node {
		
		// value of the node
		int data;
		//next value constructed
		Node next = null;
		Node last = null;
		
		// passing new node by value
		 Node (int value){
			
			data = value;
			next = null;
			last = null;
			
			
		}
		
	}
	
	// append to existing list method
	public static LinkedListClass insert(int value, LinkedListClass list) {
		
		// new node created, next value is null.
		Node addedNode = new Node(value);
		addedNode.next = null;
		addedNode.last = null;
		
		// if head already exists, add to the end of the linked list/\.
		if(list.head != null) {
			// add to end of list
			Node lastVal = list.head;
			
			// traversal to end of list
			while (lastVal.next != null) {
				
				lastVal = lastVal.next;
				
			}
			
			// reach end, add to end
			
			
			lastVal.next = addedNode;
			lastVal.last = lastVal;
			
			
			
		} else {
			// no head, add new node to head
			list.head = addedNode;
			
		}
		
		return list;
	
	}
	
	// method to print list
	public static void printList(LinkedListClass list) {
		
		Node current = list.head;
		
		// traverse list, print each data point
		while (current != null) {
			
			System.out.println(current.data + " ");
			current = current.next;
			
		}
	
	}
	
	public static Node next(Node n) {
		
		return n.next;
		
	}
	
	public static Node last(Node n) {
		
		return n.last;
		
	}
	

}
