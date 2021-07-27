package com.test.concepts;

public class FindingSmallestElement {

	public static void main(String[] args) {
		int numbers[] = new int[] { 32, 43, 53, 54, 32, 65, 11, 98, 43, 23 };

		// assign first element of an array to largest and smallest
		int smallest = numbers[0];
		int largetst = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largetst) {
				largetst = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}

		}
		System.out.println("smalest element in the array is :" + smallest);
		System.out.println("largetst element in the array is :" + largetst);
	}

}
