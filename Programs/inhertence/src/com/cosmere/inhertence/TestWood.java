package com.cosmere.inhertence;

import com.cosmere.inhertence.dto.Table;
import com.cosmere.inhertence.dto.Wood;

public class TestWood {

	public static void main(String[] args) {
		Wood wood = new Wood();
		System.out.println(wood.name("Teak Wood"));
		System.out.println(wood.color("Light Yellow"));
		System.out.println(wood.height(5.7f));
		System.out.println(wood.width(15.5f));
		System.out.println(wood.price(5000));
		
		System.out.println();
		
		Table table = new Table();
		System.out.println(table.color("Brown"));
		System.out.println(table.price(2000));
		System.out.println(table.height(10.6f));
		System.out.println(table.width(16.00f));
		System.out.println(table.length(4.8f));
	
	}

}
