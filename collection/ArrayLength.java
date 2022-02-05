package com.cosmere.collection;

public class ArrayLength {
	
	public void printArray(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public  int[] resizeArray(int[] arr, int capacity) {
		int[] arr1 = new int[capacity];
		for (int i = 0; i<arr.length; i++) {
        arr1[i] = arr[i];
	}
		arr=arr1;
		return arr;
	}
	public static void main(String[] args) {
		
		ArrayLength arrlength = new ArrayLength();
		
		int[] arr = new int[] {10, 20, 30, 40, 50};
		System.out.println("Array Length is: "+arr.length);
		
		arrlength.printArray(arr);
		
		arr=arrlength.resizeArray(arr, 10);
		System.out.println("Resize Array length is: "+arr.length);
		
	}

}
