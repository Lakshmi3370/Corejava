package com.cosmere.inhertence;

import com.cosmere.inhertence.dto.Flower;
import com.cosmere.inhertence.dto.Lotus;

public class TestFlowers {

	public static void main(String[] args) {
		Flower flower = new Flower();
		System.out.println(flower.name("Rose"));
		System.out.println(flower.color("Yellow"));
		System.out.println(flower.height(10.67f));
		System.out.println(flower.noOfpetals(46));
		System.out.println(flower.price(30)+" Rs");
		
		System.out.println();
		
		Lotus lotus = new Lotus();
		System.out.println();
		System.out.println(lotus.type("Lotus"));
		System.out.println(lotus.color("Pink"));
		System.out.println(lotus.noOfpetals((byte)25));
		System.out.println(lotus.price(70)+ " Rs");
		System.out.println(lotus.height(4.5f));

	}

}
