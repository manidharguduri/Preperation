package com.manin.gayi.trees;

public class TreeSize {
	
	// Node root
	Node root;
	
	// function takes the node as input and returns the size...
	public static int treeSize(Node root)
	{
		
		if(root == null)
		{
			return 0;
		}
		
		return (1 + treeSize(root.getLeft())+treeSize(root.getRight()));
	
	}

	// Node Structure...
	private static class Node
	{
		int key;
		Node left,right;
		public  Node(int item) 
	    {
	        this.key= item;
	        left = right = null;
	    }
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	}
	
	
	public static void main(String[] args) {
		
		// Let us construct the BST shown in the above figure
		TreeSize tree = new TreeSize();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        
//        		20
//        8				22
//      4   12
//        10  14
        
        int treesize = treeSize(tree.root);
        System.out.println("Tree Size : "+treesize);
        
	}

}
