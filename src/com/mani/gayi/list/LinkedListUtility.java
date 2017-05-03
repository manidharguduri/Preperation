package com.mani.gayi.list;

public class LinkedListUtility {

	public static void main(String[] args) {
		Node head = new Node();

		// Node node1 = formLinkedList(head);
		// iterateAndPrintLinkedList(node1);

		//boolean res = deleteMiddleElement(head);
		// head=addNodeToALinkedList(head,'r');
		 head=addNodeToALinkedList(head,'n');
		iterateAndPrintLinkedList(head);
		head=addNodeToALinkedList(head,'k');
		iterateAndPrintLinkedList(head);
	}

	
	//This method is used to iterate through the 
	//linked list and print the elements on the console.
	public static void iterateAndPrintLinkedList(Node head) {
		Node temp = new Node();
		temp = head;
		System.out.println("The Linked List Formed is :: ");
		// Iterating the loop till the data in a list is not defined
		while (temp.getData() != '\u0000') {

			System.out.println(temp.getData());
			if (temp.getRtNode() != null) {
				temp = temp.getRtNode();
			} else {
				break;
			}

		}
	}

	public static Node formLinkedList(Node head) {

		// Declaring node 1 and setting it has the head
		head = new Node();
		Node node1 = new Node();
		node1.setData('m');
		node1.setNodeName("firstNode");
		head = node1;

		// Declaring node 2 and setting to node node1 right node
		Node node2 = new Node();
		node2.setData('a');
		node2.setNodeName("secondNode");
		node1.setRtNode(node2);

		// Declaring node 3 and setting to node node2 right node
		Node node3 = new Node();
		node3.setData('n');
		node3.setNodeName("thirdNode");
		node2.setRtNode(node3);

		// Declaring node 4 and setting to node node3 right node
		Node node4 = new Node();
		node4.setData('i');
		node4.setNodeName("fourthNode");
		node3.setRtNode(node4);

		// Declaring node 5 and setting to node node4 right node

		Node node5 = new Node();
		node5.setData('m');
		node5.setNodeName("fifthNode");
		node4.setRtNode(node5);
		// iterateAndPrintLinkedList(head);
		
		// Declaring node 6 and setting to node node5 right node
		Node node6 = new Node();
		node6.setData('m');
		node5.setRtNode(node6);
		node6.setNodeName("sixthnode");
		node4.setRtNode(node5);
		node6.setRtNode(null); // iterateAndPrintLinkedList(head);

		return head;
	}

	
	//Method to add a new node to the existing linked list
	public static Node addNodeToALinkedList(Node head, char data) {

		head = formLinkedList(head);
		Node temp = head;
		System.out.println("Before temp.setRtNode data :: " +temp.getData());
		// Iterating the loop till the data in a list is not defined
		while (temp.getData() != '\u0000') {
			if (temp.getRtNode() != null)
			{
				temp = temp.getRtNode();
				System.out.println("Cnahged temp.setRtNode data :: " +temp.getData());
			}
			else
				break;
		}

		Node newnode = new Node();
		newnode.setData(data);
		temp.setRtNode(newnode);
		System.out.println("temp.setRtNode data :: " +temp.getData());
		
		//returning the head
		return head;

	}

	
	//This method is to delete the middle element in a linked list
	public static boolean deleteMiddleElement(Node head) {

		head = formLinkedList(head);

		iterateAndPrintLinkedList(head);

		System.out.println("deleteMiddleElement :: head get name :: " + head.getNodeName());

		
		//If there are no elements in a linke dlist returning false
		if (head == null) {
			System.out.println("There is no elements in a linked list");
			return false;
		}
		//If there is no second element or three elements in a linked list 
		//then returning false as there is no middle element.
		
		if (head.getRtNode() == null || head.getRtNode().getRtNode() == null) {

			System.out.println("There is no middle element in a linked list :: " + head.getRtNode().getNodeName());
			return false;
		}

		//If there are more than three elements in a linke dlist
		//then deleting the middle element as below 
		else {

			Node temp = head;
			Node prev = head;
			Node p1 = head;
			Node p2 = head;

			while (p2.getRtNode().getRtNode() != null) {
				prev = p1;
				System.out.println("The previous node is::" + prev.getNodeName());
				if (p2.getRtNode().getRtNode() != null) {
					p2 = p2.getRtNode().getRtNode();
					System.out.println("The changed p2 node is :: " + p2.getNodeName());
				}
				p1 = p1.getRtNode();
				System.out.println("The chnaged p1 node is :: " + p1.getNodeName());
				temp = p1.getRtNode();
				System.out.println("The changed temp value is :: " + temp.getNodeName());

			}
			prev.setRtNode(temp);

			iterateAndPrintLinkedList(head);
		}
		return true;

	}

}
