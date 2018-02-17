package net.mmyz.ld.main;

import net.mmyz.ld.queue.IntegerAnnularQueue;

public class QueueTest {

	public static void main(String[] args) {
		IntegerAnnularQueue myQueue = new IntegerAnnularQueue(4);
		myQueue.add(5);
		myQueue.add(4);
		myQueue.add(1);
		myQueue.add(0);
		myQueue.add(7);
		
		myQueue.printElement();
		System.out.println("   ");
	}

}
