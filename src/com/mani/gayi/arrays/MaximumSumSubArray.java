package com.mani.gayi.arrays;

public class MaximumSumSubArray {

	// which stores the result details...
	static class Result {

		// index which denotes the starting index of the sub array.
		int startindex;

		// index which denotes the ending index of the sub array.
		int endindex;

		// variable which denotes the sum of the sub array.
		int result;

		public int getStartindex() {
			return startindex;
		}

		public void setStartindex(int startindex) {
			this.startindex = startindex;
		}

		public int getEndindex() {
			return endindex;
		}

		public void setEndindex(int endindex) {
			this.endindex = endindex;
		}

		public int getResult() {
			return result;
		}

		public void setResult(int result) {
			this.result = result;
		}

		public Result() {
			this.result = Integer.MIN_VALUE;
		}

	}

	public static void main(String[] args) {

		int[] data = { 1, -5, 3, 2, -4, 9 };
		
		int[] data1 = { 1, -5, -3, 2, -4, 9,-8,7 };

	//	Result result = maxSumSubArrayUsing3ForLoops(data);
		
		Result result = maxSumSubArrayUsing2ForLoops(data1);

		System.out.println("Sub array starts at :" + result.getStartindex() + " and ends at :" + result.getEndindex());
		System.out.println("Final Sub Array Sum :" + result.result);

	}

	// this gives the time complexity of O (n^3)...
	private static Result maxSumSubArrayUsing3ForLoops(int[] data) {

		Result result = new Result();

		// iterate for all sub array sizes...
		for (int subArraySize = 1; subArraySize < data.length; subArraySize++) {

			// variable which denotes the starting index of the sub array.
			for (int startIndex = 0; startIndex < data.length; startIndex++) {

				// skip the extreme ends which is not feasible.
				if (subArraySize + startIndex > data.length)
					break;

				// stores the sum of the sub array.
				int sum = 0;

				// number of iterations and calculate the sum for all sub
				// arrays.
				for (int noOfIterations = startIndex; noOfIterations < startIndex + subArraySize; noOfIterations++) {
					// adding the data from sub array
					sum = sum + data[noOfIterations];

				}

				// storing the sub array indexes...
				if (result.getResult() < sum) {
					result.setStartindex(startIndex);
					result.setEndindex(startIndex + subArraySize - 1);
				}

				result.setResult(Math.max(result.getResult(), sum));
			}

		}

		return result;

	}

	private static Result maxSumSubArrayUsing2ForLoops(int[] data) {
		// we will optimize based on the previous result.

		Result result = new Result();

		// starting index.
		for (int startIndex = 0; startIndex < data.length; startIndex++) {

			// stores the sum.
			int sum = 0;

			// sub array size...
			for (int subArraySize = 1; subArraySize < data.length; subArraySize++) {
				
				
				// skip the elements that are not present.
				if (subArraySize + startIndex > data.length) {
					break;
				}
				result.setEndindex(startIndex + subArraySize - 1);
				sum = data[startIndex + subArraySize - 1] + sum;

			}

			// storing the sub array indexes...
			if (result.getResult() < sum) {
				result.setStartindex(startIndex);

			}

			result.setResult(Math.max(result.getResult(), sum));
		}

		return result;
	}

}
