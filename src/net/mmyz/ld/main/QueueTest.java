package net.mmyz.ld.main;

import net.mmyz.ld.queue.AnnularQueue;

public class QueueTest {

	public static void main(String[] args) {
		AnnularQueue<Integer> myQueue = new AnnularQueue<Integer>(4);
		myQueue.add(5);
		myQueue.add(4);
		myQueue.add(1);
		myQueue.add(0);
		
		myQueue.printElement();
		
		System.out.println("=================================");
		
		myQueue.remove();
		myQueue.remove();
		
		myQueue.printElement();

		System.out.println("=================================");
		
		myQueue.add(8);
		myQueue.add(9);
		
		myQueue.printElement();
	}

}
