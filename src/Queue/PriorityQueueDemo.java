package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue <Integer> priorityQue = new PriorityQueue(Collections.reverseOrder()); // we use collections.reverseOrder() for reversing the order in decending order b
	
		
		priorityQue.offer(10);
		priorityQue.offer(5);
		priorityQue.offer(1);
		priorityQue.offer(-4);
		
		System.out.println(priorityQue);

	}

}
