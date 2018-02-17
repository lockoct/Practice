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
	
	//为队列添加元素
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
	
	//删除队列首元素
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
	
	//获取队列长度
	public int size() {
		return length;
	}
	
	//判断队列是否为空
	public boolean isEmpty() {
		if(length == 0) {
			return true;			
		}else {
			return false;
		}
	}
	
	//判断队列是否为满
	public boolean isFull() {
		if(length == capacity) {
			return true;			
		}else {
			return false;
		}
	}
	
	//遍历队列元素
	public void printElement() {
		if (isEmpty()) {
			System.out.println("队列中没有元素");
		}else {
			for (int i = head; i < head+length;i++) {
				System.out.print(element[i%capacity]+"\t");
			}
			System.out.println();
		}
	}
	
	//清空队列元素
	public void cleanQueue() {
		this.head = 0;
		this.tail = 0;
		this.length = 0;
	}
}
