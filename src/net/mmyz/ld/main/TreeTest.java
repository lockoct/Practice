package net.mmyz.ld.main;

import net.mmyz.ld.tree.Tree;

public class TreeTest {

	public static void main(String[] args) {
		Tree myTree = new Tree(40,50);
		myTree.addNode(0, 0, 30);
		myTree.addNode(0, 1, 80);
		myTree.addNode(1, 0, 10);
		myTree.addNode(1, 1, 40);
		myTree.addNode(2, 0, 70);
		myTree.addNode(2, 1, 90);
		myTree.addNode(3, 0, 51);
		myTree.addNode(3, 1, 15);
		myTree.addNode(4, 0, 35);
		myTree.addNode(4, 1, 66);
		myTree.addNode(5, 0, 60);
		myTree.addNode(5, 1, 75);
		myTree.addNode(6, 0, 85);
		myTree.addNode(6, 1, 95);
		myTree.addNode(7, 0, 31);
		myTree.addNode(7, 1, 81);
		myTree.addNode(8, 0, 13);
		myTree.addNode(8, 1, 20);
		myTree.addNode(9, 0, 99);
		myTree.addNode(9, 1, 37);
		myTree.addNode(10, 0, 22);
		myTree.addNode(10, 1, 33);
		myTree.addNode(11, 0, 72);
		myTree.addNode(11, 1, 78);
		myTree.addNode(12, 0, 59);
		myTree.addNode(12, 1, 69);
		myTree.addNode(13, 0, 37);
		myTree.addNode(13, 1, 73);
		myTree.addNode(14, 0, 22);
		myTree.addNode(14, 1, 33);
		myTree.addNode(15, 0, 55);
		myTree.addNode(15, 1, 66);
		
		myTree.printTree();
	}

}
