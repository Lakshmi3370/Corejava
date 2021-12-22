package com.cosmere.inhertence;

import com.cosmere.inhertence.dto.Bird;
import com.cosmere.inhertence.dto.Peacock;

public class TestBird {

	public static void main(String[] args) {
		Bird bird = new Bird();
		System.out.println(bird.birdName("Parrot"));
		System.out.println(bird.legs((byte)2));
		System.out.println(bird.fly(true));
		System.out.println(bird.color("Green"));
		System.out.println(bird.weight(1.2f)+ " kg");
		
		System.out.println();
		
		Peacock peacock = new Peacock();
		System.out.println(peacock.color("blue with green"));
		System.out.println(peacock.swim(false));
		System.out.println(peacock.weight(5.4f)+ " kg");
		System.out.println(peacock.height(7.8f));
		System.out.println(peacock.noOfFethers((byte)(35)));

	}

}
