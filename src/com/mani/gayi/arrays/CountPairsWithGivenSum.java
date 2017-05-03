package com.mani.gayi.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Author: Mani,
 * Problem:Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’,
 * Source: http://www.geeksforgeeks.org/count-pairs-with-given-sum/
 * 
 * */

public class CountPairsWithGivenSum {

	private static List<Pair> list = new ArrayList<Pair>();

	class Pair {
		int x = 0;
		int y = 0;
	}

	public static void main(String[] args) {

		int array[] = { 1, 2,3,4,3 };

		printPairs(array, 6);

		System.out.println("number of pairs : " + list.size());
		
		for(Pair p : list)
		{
			System.out.println("X value : "+p.x+" and y value :"+p.y);
		}

	}

	
	/*
	 * Time complexity O(n) times.
	 * */
	public static void printPairs(int[] array, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Length of the given array...
		int len = array.length;

		// place the values from array in to hash map.
		for (int index = 0; index < len; index++) {
			// if the value is already present in the map increment the value.
			if (map.containsKey(array[index])) {
				int value = map.get(array[index]);
				map.put(array[index], value + 1);
			}
			// if the value is not present in the map then place the value one
			// in the map.
			else {
				map.put(array[index], 1);
			}

		}

		for (int index = 0; index < len; index++) {
			Pair p = new CountPairsWithGivenSum().new Pair();
			int accompanyValue = sum - array[index];
			

			int value1 = map.get(array[index]);
			map.put(array[index], --value1);
			
			if (map.get(accompanyValue) != null && map.get(accompanyValue) > 0) {
				int value = map.get(accompanyValue);
				map.put(accompanyValue, --value);


				p.x = accompanyValue;
				p.y = array[index];
				list.add(p);
			}
			else
			{
				map.put(array[index], value1+1);
			}
		}

	}
}
