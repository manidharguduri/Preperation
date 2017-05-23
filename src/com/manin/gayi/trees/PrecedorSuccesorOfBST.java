package com.manin.gayi.trees;


// author:Mani

// Problem: Inorder predecessor and successor for a given key in BST

// Logic: check for the given node key is equal to the key given input.
//		  if the key is equal 
//		  to get proceeder then go to left and iterate through right most to get proceeder.  
//		  to get successor then go to right and iterate through left most to get successor.

public class PrecedorSuccesorOfBST {
	
	// Loads the proceeder result in this variable...
	private static Node proceeder = null;
	
	// Loads the successor result in this variable...
	private static Node successor = null;
		
	
	private static void findproceedersuccessor(int key,Node root)
	{
		if(root ==null)
			return ;
		
		// if the given element matches the key...
		if(root.getKey()==key)
		{
			
			// iterating through the left node to get the value...
			Node left = root.getLeft();
			while(left!=null)
			{
				proceeder = left;
				left = left.getRight();
			}
			
			// iterating through right node to get the value...
			Node right = root.getRight();
			while(right!=null)
			{
				successor= right;
				right = right.getLeft();
			}
			return ;
		}
		
		// if not given element doesn't match the root node...
		
		// if the data is less than left search in left...
		if(key<root.getKey())
		{
			findproceedersuccessor(key, root.getLeft());
		}
		
		// if the data is less than right search in left...
		else if(key>root.getKey())
		{
			findproceedersuccessor(key, root.getRight());
		}
			
		
	}
	
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
	
	Node root = null;
	
	public static void main(String[] args) {
		
		// Let us construct the BST shown in the above figure
		PrecedorSuccesorOfBST tree = new PrecedorSuccesorOfBST();
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
   
        findproceedersuccessor(8,tree.root);
        
        if(proceeder!=null)
        {
        	System.out.println("proceeder Data : "+proceeder.getKey());
        }
        else
        {
        	System.out.println("proceeder Data :-(");
        }
        
        if(successor!=null)
        {
        	System.out.println("successor Data : "+successor.getKey());
        }
        else
        {
        	System.out.println("No successor Data :-(");
        }
		
	}

}
