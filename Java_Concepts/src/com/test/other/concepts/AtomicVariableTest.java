package com.test.other.concepts;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicVariableTest {
public static void main(String args[]) {
	int x = 1;
	AtomicInteger a = new AtomicInteger();
	a.set(100);
	
	int arr[] = new int [3];
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	
	AtomicIntegerArray atomicArray = new AtomicIntegerArray(arr);
	System.out.println("array:"+Arrays.toString(arr)+", first val:"+atomicArray.get(0));
}
}
