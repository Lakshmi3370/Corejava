package com.cosmere.inhertence;

import com.cosmere.inhertence.dto.Airlins;
import com.cosmere.inhertence.dto.Indigo;

public class TestAirlins {

	public static void main(String[] args) {
		Airlins airlins = new Airlins();	
		System.out.println(airlins.location("USA"));
		System.out.println(airlins.revenue("$566777"));
		System.out.println(airlins.ratings(9.3f));
		System.out.println(airlins.foundedYear(1967));
		System.out.println(airlins.totalAirlins(5000));
		
		System.out.println();
		
		Indigo indigo = new Indigo();
		System.out.println(indigo.location("India"));
		System.out.println(indigo.color("Blue and White"));
		System.out.println(indigo.ticketFair(15000));
		System.out.println(indigo.noOfSeats(300));
		System.out.println(indigo.passanger(250));
	}

}
