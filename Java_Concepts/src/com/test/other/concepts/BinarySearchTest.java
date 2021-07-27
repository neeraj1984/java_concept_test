package com.test.other.concepts;

import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {

		BinarySearchTest myClass = new BinarySearchTest();

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
		System.out.println("type element to be searched:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int pos = myClass.binarySearch(arr, Integer.parseInt(input));
		if(pos  == -1) {
			System.out.println("element "+ input +"does not exist." );
		}else {
			System.out.println("element "+ input +"'s position: " + pos);
		}
		
		sc.close();
	}

	public int binarySearch(int[] inputArr, int key) {

		int start = 0;
		int end = inputArr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == inputArr[mid]) {
				return mid;
			}

			if (key < inputArr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
