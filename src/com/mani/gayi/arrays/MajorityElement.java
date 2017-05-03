package com.mani.gayi.arrays;

/*
 * Author: Mani,
 * Problem: A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).,
 * Source: http://www.geeksforgeeks.org/majority-element/
 * 
 * */

public class MajorityElement {

	public static void main(String[] args) {

		int data[] = { 1, 2, 4, 2, 2, 3, 2, 2, 1, 2 };

		new MajorityElement().findDupGtdiv2(data);
	}

	/*
	 * This function returns the majority element.
	 **/

	public int findDupGtdiv2(int[] data) {

		// finds the majority element.
		int candidateKey = findCandidateKey(data);

		// verify whether the element found is majority one or not.
		boolean isMajor = isMarjorityElement(data, candidateKey);
		if (isMajor) {
			System.out.println("Majority Element : " + candidateKey);
		}
		return 0;
	}

	/*
	 * This function returns an boolean value whether the given element is
	 * Majority element or not based on the size of the array.
	 **/
	private boolean isMarjorityElement(int[] data, int candidateKey) {

		int count = 0;

		for (int index = 0; index < data.length; index++) {
			if (data[index] == candidateKey) {
				count++;
			}

			if (count > data.length / 2) {
				return true;
			}
		}

		return false;
	}

	/*
	 * This function returns a majority element which checks one by one element
	 * in the array.
	 * 
	 * logic: consider the first element as majority and initialize the count as
	 * 1 then compare with the next elements in the array with the majority
	 * element and increment and decrement the count based on the elements
	 * found.
	 **/
	private int findCandidateKey(int[] data) {

		int max_ele_index = 0;
		int count = 1;

		for (int index = 1; index < data.length; index++) {
			if (data[index] == data[max_ele_index]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				max_ele_index = data[index];
				count = 1;
			}

		}

		return data[max_ele_index];
	}
}
