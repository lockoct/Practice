package net.mmyz.ld.stack;

import java.util.ArrayList;

public class Stack<T>{

	private int capacity;
	private int top = 0;
	private ArrayList<T> element;
	
	public Stack(int capacity) {
		this.capacity = capacity;
		element = new ArrayList<>(capacity);
	}
	
	//��ȡջ��С
	public int size() {
		return top;
	}
	
	//��ջ
	public boolean push(T c) {
		if(isFull()) {
			System.out.println("ջ����");
			return false;
		}
		element.add(c);
		top++;
		return true;
	}

	//��ջ
	public boolean pop() {
		if(isEmpty()) {
			System.out.println("ջ���Ѿ�û��Ԫ��");
			return false;
		}
		element.remove(top-1);
		top--;
		return true;
	}
	
	//�пպ���
	public boolean isFull() {
		if(top == capacity){
			return true;
		}
		return false;
	}
	
	//��������
	public boolean isEmpty() {
		if(top == 0){
			return true;
		}
		return false;
	}
	
	//���ջԪ��
	public void cleanStack() {
		top = 0;
	}
	
	//��ӡջ����Ԫ��
	public void printElement(boolean isFromButtom) {
		if(isEmpty()) {
			System.out.println("ջ��û��Ԫ��");
		}else {
			if(isFromButtom) {
				for (int i = 0; i < top; i++) {
					System.out.print(element.get(i)+"\t");
				}
				System.out.println();							
			}else {
				for (int i = top-1; i >= 0; i--) {
					System.out.print(element.get(i)+"\t");
				}
				System.out.println();							
			}
		}
	}
}