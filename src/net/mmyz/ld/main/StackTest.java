package net.mmyz.ld.main;

import net.mmyz.ld.stack.CharStack;

public class StackTest {

	public static void main(String[] args) {
		CharStack myStack = new CharStack(4);
		
		myStack.push('a');
		myStack.push('c');
		myStack.push('d');
		myStack.push('e');
		myStack.push('b');

		myStack.printElement(true);
		System.out.println("=================================");

		myStack.pop();
		
		myStack.printElement(true);
		System.out.println("=================================");
		
		myStack.printElement(false);
		System.out.println("=================================");

		myStack.cleanStack();
		myStack.printElement(true);
	}

}
