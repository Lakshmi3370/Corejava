package com.cosmere.exception.block;

public class ClassCast {

	public static void main(String[] args) {
		
		Object obj = new Object();
	
		try {
			int a = (int)obj;
			System.out.println(a);
			
		}
		catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}

}
