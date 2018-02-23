package net.mmyz.ld.tree;

public class Tree {
	
	private int[] tree;
	private int capacity;
	
	public Tree(int capacity,int firstNodeValue) {
		this.capacity = capacity;
		tree = new int[capacity];
		for (int i = 0; i < tree.length; i++) {
			tree[i] = 0;
		}
		tree[0] = firstNodeValue;
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
			if(nodeIndex*2+1 < capacity && tree[nodeIndex*2+1] == 0) {
				tree[nodeIndex*2+1] = value;
				return true;	
			}
			return false;	
		//判断插入是否为右节点
		}else if(direction == 1) {
			if(nodeIndex*2+2 < capacity && tree[nodeIndex*2+2] == 0) {
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
			System.out.println("  "+tree[0]);
		}
		
		int row = 2;
		while(true) {
			if(Math.pow(2, row)-1 >= capacity) {
				break;
			}
			row++;
		}
		
		for(int j = 1;j<=row;j++) {
			for (int k = row-j+1; k > 0; k--) {
				System.out.print("  ");
			}
			for (int k = (int)Math.pow(2, j-1)-1; k < Math.pow(2, j)-1; k++) {
				if(k >= capacity) {
					break;
				}
				System.out.print(tree[k]);
				for (int l = row-j+1; l > 0; l--) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
