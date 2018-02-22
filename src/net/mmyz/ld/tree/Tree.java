package net.mmyz.ld.tree;

public class Tree {
	
	private int[] tree;
	private int capacity;
	
	public Tree(int capacity) {
		this.capacity = capacity;
		tree = new int[capacity];
		for (int i = 0; i < tree.length; i++) {
			tree[i] = 0;
		}
	}
	public int searchNode(int nodeIndex) {
		if(nodeIndex < 0 || nodeIndex >= capacity) {
			return -1;
		}
		if(tree[nodeIndex] == 0) {
			return -2;	
		}
		return tree[nodeIndex];
	}
	
	public boolean addNode(int nodeIndex,int direction,int value) {
		if(nodeIndex < 0 || nodeIndex >= capacity) {
			return false;
		}
		//从父节点向下插入节点
		if(tree[nodeIndex] == 0) {
			return false;
		}
		//判断插入是否为左节点
		if(direction == 0) {
			if(tree[nodeIndex*2+1] != 0 || nodeIndex*2+1 >= capacity) {
				tree[nodeIndex*2+1] = value;
				return true;	
			}
			return false;	
		//判断插入是否为右节点
		}else if(direction == 1) {
			if(tree[nodeIndex*2+2] != 0 || nodeIndex*2+2 >= capacity) {
				tree[nodeIndex*2+2] = value;
				return true;			
			}
			return false;			
		}
		return true;
	}
	
	public boolean deleteNode(int nodeIndex) {
		if(nodeIndex < 0 || nodeIndex >= capacity) {
			return false;
		}
		if(tree[nodeIndex] != 0) {
			return false;
		}
		tree[nodeIndex] = 0;
		deleteNode(nodeIndex*2+1);
		deleteNode(nodeIndex*2+2);
		return true;
	}
	
	public void printTree() {
		if(capacity == 1) {
			System.out.println("\t"+tree[0]);
		}
		for(int i = 1;i<=(capacity+1)*capacity/2;i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("\t");
//			}
//			for (int j = 0; j < i; j++) {
//				System.out.print(tree[j]+"\t");
//			}
			System.out.println();
		}
	}
}
