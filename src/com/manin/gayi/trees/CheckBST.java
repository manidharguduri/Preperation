package com.manin.gayi.trees;

public class CheckBST {

	
	/*
	 * Author:	Mani
	 * Problem:	A program to check if a binary tree is BST or not
	 * Logic:	The trick is to write a utility helper function isBST(Node root, int min, int max)
	 * 			that traverses down the tree keeping track of the narrowing min and max allowed values as it goes, 
	 * 			looking at each node only once. 
	 * 			The initial values for min and max should be Integer.MIN_VALUE and Integer.MAX_VALUE — they narrow from there.
	 * **/
	public static boolean isBST(Node root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.getKey() < min || root.getKey() > max) {
			return false;
		}
		return (isBST(root.getLeft(), min, root.getKey() - 1) && isBST(root.getRight(), root.getKey() + 1, max));
	}

	// Node Structure...
	private static class Node {
		int key;
		Node left, right;

		public Node(int item) {
			this.key = item;
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

	/* Driver program to test above functions */
	public static void main(String args[]) {
		CheckBST tree = new CheckBST();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);

		System.out.println("Is the given try BST " + isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}

}
