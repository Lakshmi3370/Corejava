package com.cosmere.exception.block;

public class Book {
	
	public Book() {
		System.out.println("Knowledge can be gained through books");
	}
	//static block
	static {
		System.out.println("Static Block");
	}
	
	//non-static block
	{
		System.out.println("Non-Static Block-1");
		{
			System.out.println("Non-Static Block-2");
		}
	}

}
