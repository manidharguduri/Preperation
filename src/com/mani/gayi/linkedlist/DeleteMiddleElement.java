package com.mani.gayi.linkedlist;

/*
 * author:Lakshmi
 * Source:http://www.geeksforgeeks.org/delete-middle-of-linked-list/
 * **/
public class DeleteMiddleElement {

	public void deleteMiddleElemnt() {

		if (head == null) {
			System.out.println("There is no middle element in the given  list");
		}

		else {
			if (head.next == null || head.next.next == null) {
				System.out.println("There are only two elements in the given list");
			}

			else {
				// Declaring pointer 1 and pointer 2 to get the middle element
				// of a
				// list
				Node pointer1 = head;
				Node pointer2 = head;

				// Declaring prev_pointer and temp_pointer to reform the linked
				// list
				// once we delete middle element
				Node prev_pointer = head;
				Node tem_pointer = head;

				while (pointer2.next != null) {

					if (pointer2.next.next != null) {
						pointer2 = pointer2.next.next;
					} else {
						break;
					}
					prev_pointer = pointer1;
					pointer1 = pointer1.next;
					tem_pointer = pointer1.next;

				}
				prev_pointer.next = tem_pointer;

			}
		}
	}

	// Driver method...

	public static void main(String[] args) {
		DeleteMiddleElement l = new DeleteMiddleElement();
		System.out.println("\nCreated Linked list is: ");
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(8989);
		l.add(5989);
		l.add(994989);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.print();
		System.out.println();
		System.out.println("\nDeleted the middle element in a list is :: ");
		l.deleteMiddleElemnt();
		l.print();
	}

	// ======================================== Below code is present in all
	// classes for data purpose.

	Node head;

	/* Linked list Node structure */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	/**
	 * Method to add elements to a linked list.
	 * 
	 * @param data
	 * @return
	 */
	public boolean add(int data) {
		// Creating a new node object.
		Node newnode = new Node(data);
		newnode.next = null;

		if (head == null) {
			head = newnode;
			// System.out
			// .println("This is the first element in the " + "linked list so
			// adding head to it :: " + head.data);
			return true;
		}

		// If there are elements to the head.
		else {
			Node temp = head;
			// Iterating to the end of linked list.
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
			// System.out.println("The newly added elemnt to the linked list is
			// ::" + newnode.data);

			return true;
		}

	}

	// Prints the elements of a linked list on the console
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
	}
}
