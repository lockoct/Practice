package net.mmyz.ld.queue;

public class IntegerAnnularQueue {
	private int capacity;
	private int	length = 0;
	private int head = 0;
	private int tail = 0;
	private int[] element;
	
	public IntegerAnnularQueue(int capacity) {
		this.capacity = capacity;
		this.element = new int[capacity];
	}
	
	public boolean add(int element) {
		if(isFull()) {
			System.out.println("队列已满");
			return false;
		}else {
			this.element[tail] = element;
			tail++;
			length++;
			tail = tail % capacity;
			return true;
		}
	}
	
	public boolean remove() {
		if(isEmpty()) {
			System.out.println("队列中已没有元素");
			return false;
		}else {
			head++;
			length--;
			head = head % capacity;
			return true;
		}
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		if(head == tail) {
			return true;			
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(length == capacity) {
			return true;			
		}else {
			return false;
		}
	}
	public void printElement() {
		for (int i = head; i < head+element.length; i++) {
			System.out.println(element[i%element.length]);
		}
	}
}
