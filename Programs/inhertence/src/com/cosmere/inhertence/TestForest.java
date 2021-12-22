package com.cosmere.inhertence;

import com.cosmere.inhertence.dto.Forest;
import com.cosmere.inhertence.dto.Nagarahole;

public class TestForest {

	public static void main(String[] args) {

		Forest forest = new Forest();
		System.out.println(forest.name("Bannergatta Forest"));
		System.out.println(forest.loaction("Bannergatta"));
		System.out.println(forest.state("Karnataka"));
		System.out.println(forest.animals(78));
		System.out.println(forest.birds(56));
		
		System.out.println();
		
		Nagarahole nagarahole = new Nagarahole();
		System.out.println(nagarahole.type("Forest"));
		System.out.println(nagarahole.place("Nagarahole"));
		System.out.println(nagarahole.state("Karnataka"));
		System.out.println(nagarahole.country("India"));
		System.out.println(nagarahole.distanceFromBangalore( 248.0)+ "km");

	}

}
