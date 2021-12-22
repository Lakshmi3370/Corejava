package com.cosmere.inhertence;

import com.cosmere.inhertence.dto.Fruits;
import com.cosmere.inhertence.dto.Banana;

public class TestFruits {
	public static void main(String[] args) {
		Fruits fruit = new Fruits();
		System.out.println(fruit.fruitName("Apple"));
		System.out.println(fruit.calcium("6 mg"));
		System.out.println(fruit.protein(2.6f)+" g");
		System.out.println(fruit.totalFat(0.17f)+ " g");
		System.out.println(fruit.vitaminA(54.0f)+" IU");
		
		System.out.println();
		
		Banana banana = new Banana();
		
		System.out.println(banana.calories("1.2 g"));
		System.out.println(banana.color("Yellow"));
		System.out.println(banana.protein(1.9f)+ " g");
		System.out.println(banana.weight((byte)70)+" gram");
		System.out.println(banana.price((byte)30));
	}

}
