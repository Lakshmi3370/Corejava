package com.cosmere.exception.block;

public class ArithmaticExc {
	
	static int a = 0;
	static int b =4;
	 

	public static void main(String[] args) {
		
		try {
		System.out.println(b/a);
		}
		
    catch(ArithmeticException e){
	System.out.println("Don't divide by zero");
}
	}

}
