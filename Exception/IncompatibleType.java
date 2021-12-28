package com.cosmere.exception;

public class IncompatibleType {
	public static int add() {
		int num1=2;
		int num2= 3;
		int sum=num1+num2;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add());
		
	}

}
