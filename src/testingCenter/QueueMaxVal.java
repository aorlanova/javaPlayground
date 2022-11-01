package testingCenter;
import java.util.*;

/* Antonina Orlanova - Fall 2022 - Tues 3pm
 * Creates a Queue class in which max value has an o(1) lookup time by using an auxiliary Queue structure.
 */

public class QueueMaxVal {
	
	// class contain two queue structures, one that stores max and one that stores all values(queuemain)
	ArrayDeque<Integer> queueMain = new ArrayDeque<Integer>();
	ArrayDeque<Integer> queueMax = new ArrayDeque<Integer>();
	
	// appendNode adds a node to the end of the queue while updating max queue
	public void appendNode(int value) {
		
		int holder = 0;
		
		queueMain.add(value);
		
		// if max is empty, max is the first element
		if (queueMax.isEmpty()) {
			
			queueMax.add(value);
			 
		// if added node is of a higher value than max queue head, append it to the head and move previous max behind it
		} else if (value >= queueMax.element()) {
			
			holder = queueMax.removeFirst();
			queueMax.addFirst(value);
			queueMax.addLast(holder);
			
		} 
		
	}
	
	// remove node
	public void removeNode() {
		
		// if the max is equal to the element being removed, remove both
		if(queueMain.element() == queueMax.element()) {
			
			queueMax.removeFirst();
			queueMain.removeFirst();
			
		} else {
			
			queueMain.removeFirst();
			
		}
		
	}
	
	// prints max value
	public void getMax() {
		
		System.out.println(this.queueMax.getFirst());
		
	}

	public static void main(String[] args) {
		
		QueueMaxVal test1 = new QueueMaxVal();
		test1.appendNode(1);
		test1.appendNode(4);
		test1.appendNode(7);
		test1.getMax();
		
		QueueMaxVal test2 = new QueueMaxVal();
		test2.appendNode(5);
		test2.appendNode(7);
		test2.appendNode(8);
		test2.getMax();
		

	}

}
