package net.mmyz.ld.stack;

public class CharStack {

	private int capacity;
	private int top = 0;
	private char[] element;

	public CharStack(int capacity) {
		this.capacity = capacity;
		element = new char[capacity];
	}
	
	//获取栈大小
	public int size() {
		return top;
	}
	
	//入栈
	public boolean push(char c) {
		if(isFull()) {
			System.out.println("栈已满");
			return false;
		}
		element[top] = c;
		top++;
		return true;
	}

	//出栈
	public boolean pop() {
		if(isEmpty()) {
			System.out.println("栈中已经没有元素");
			return false;
		}
		top--;
		return true;
	}
	
	//判空函数
	public boolean isFull() {
		if(top == capacity){
			return true;
		}
		return false;
	}
	
	//判满函数
	public boolean isEmpty() {
		if(top == 0){
			return true;
		}
		return false;
	}
	
	//清空栈元素
	public void cleanStack() {
		top = 0;
	}
	
	//打印栈所有元素
	public void printElement(boolean isFromButtom) {
		if(isEmpty()) {
			System.out.println("栈中没有元素");
		}else {
			if(isFromButtom) {
				for (int i = 0; i < top; i++) {
					System.out.print(element[i]+"\t");
				}
				System.out.println();							
			}else {
				for (int i = top-1; i >= 0; i--) {
					System.out.print(element[i]+"\t");
				}
				System.out.println();							
			}
		}
	}
}