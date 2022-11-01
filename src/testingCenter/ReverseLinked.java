package testingCenter;

import java.util.*;
import testingCenter.LinkedListClass.Node;

class LinkedNode
{

    int data;
    LinkedNode next;
 
    LinkedNode(int data, LinkedNode next)
    {
        this.data = data;
        this.next = next;
    }
}
 
class Main
{
	public static void main(String[] args) {

        int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
 
        LinkedNode firstNode = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            firstNode = new LinkedNode(keys[i], firstNode);
        }
 
        firstNode = reverse(firstNode);
        printLinkedList(firstNode);
    }

    public static void printLinkedList(LinkedNode firstNode)
    {
        LinkedNode pointer = firstNode;
        while (pointer != null)
        {
            System.out.print(pointer.data + " —> ");
            pointer = pointer.next;
        }
 
        System.out.println("null");
    }
 

    public static LinkedNode reverse(LinkedNode firstNode)
    {
        LinkedNode previous = null;
        LinkedNode current = firstNode;
 

        while (current != null)
        {

            LinkedNode next = current.next;
 
            current.next = previous;    
 
            previous = current;
            current = next;
        }
 

        return previous;
    }
 
}
