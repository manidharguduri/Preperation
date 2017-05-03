package com.mani.gayi.arrays;

/*
 * Author:Mani
 * Problem:Find the Number Occurring Odd Number of Times
 * Source:http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
 * */

// A Simple Solution is to run two nested loops. The outer loop picks all elements one by one and inner loop counts number of occurrences of the element picked by outer loop. 
// Time complexity of this solution is O(n2).

// A Better Solution is to use Hashing. Use array elements as key and their counts as value. Create an empty hash table. 
// One by one traverse the given array elements and store counts. Time complexity of this solution is O(n). But it requires extra space for hashing.

// The Best Solution is to do bitwise XOR of all the elements. XOR of all elements gives us odd occurring element. 
// Please note that XOR of two elements is 0 if both elements are same and XOR of a number x with 0 is x.

public class OddNumberOccurance {

	public static void main(String[] args) {

		int data[] = { 10, 191, 12, 12, 10, 29, 28, 29, 28 };

		new OddNumberOccurance().oddOne(data);

	}

	public int oddOne(int[] data) {
		int result = 0;
		for (int index = 0; index < data.length; index++) {
			result = result ^ data[index];
		}

		System.out.println("Result : " + result);
		return 0;
	}

}
