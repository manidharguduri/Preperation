package com.mani.gayi.list;

public class Node {
	// Declaring the right node of linked list
	private Node rtNode;

	// Declaring the data to be stored in a node
	private char data;

	// To set the node name
	private String nodeName;

	// Setters and getters

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Node getRtNode() {
		return rtNode;
	}

	public void setRtNode(Node rtNode) {
		this.rtNode = rtNode;
	}

}
