package net.mmyz.ld.main;

import net.mmyz.ld.tree.Tree;

public class TreeTest {

	public static void main(String[] args) {
		Tree myTree = new Tree(9,3);
		myTree.addNode(0, 0, 5);
		myTree.addNode(0, 1, 8);
		myTree.addNode(1, 0, 2);
		myTree.addNode(1, 1, 6);
		myTree.addNode(2, 0, 9);
		myTree.addNode(2, 1, 7);
		myTree.addNode(3, 0, 1);
		myTree.addNode(3, 1, 9);
		
		myTree.printTree();
	}

}
