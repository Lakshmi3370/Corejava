package com.cosmere.exception.block;

public class ArrayIE {

	public static void main(String[] args) {
		
		int num[] = {10,20,30,40,50};
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
	try {
			System.out.println(num[5]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	
	}

}
