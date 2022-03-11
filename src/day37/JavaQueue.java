package day37;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
	public static void main(String[] args) {
		// Queue in Java represents a data structure designed to have elements
		// inserted in the end of the queue and elements removed from the beginning.
		
		// FIFO - First In First Out.
		
		// Queue has few implementations:
		// 1. PriorityQueue
		// 2. LinkedList
		// 3. ArrayDeque
		
		Queue<String> qInDMV = new LinkedList<>();
		qInDMV.offer("Alex");
		// after 2 min
		qInDMV.offer("Misha");
		qInDMV.offer("Boris");
		qInDMV.offer("Tigran");
		qInDMV.offer("Bek");
		qInDMV.add("Kuba"); 
		
		// peek will return the element based FIFO but it will not remove it from the queue.
		String nextEl = qInDMV.peek();
		if (nextEl.equals("Alex")) {
			System.out.println(nextEl + "! remove it to the end of the line!");
			
			qInDMV.remove(nextEl);
			qInDMV.offer(nextEl);
		}
		
		System.out.println("People in the queue line: " + qInDMV);
		
		// poll() will return element from the Queue and it will remove it.
		String personInProgress = qInDMV.poll();
		System.out.println("Person in progress: " + personInProgress);	
		System.out.println("People in the queue line: " + qInDMV);
		
		System.out.println("-----------");
		personInProgress = qInDMV.poll();
		System.out.println("Person in progress: " + personInProgress);
		System.out.println("People in the queue line: " + qInDMV);
		
		while (!qInDMV.isEmpty()) {
			System.out.println("-----------");
			personInProgress = qInDMV.poll();
			System.out.println("Person in progress: " + personInProgress);
			System.out.println("People in the queue line: " + qInDMV);
		}
	}
}
