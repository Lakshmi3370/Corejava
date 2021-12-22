package com.cosmere.inhertence;

import com.cosmere.inhertence.dto.Metro;
import com.cosmere.inhertence.dto.Train;

public class TestMetro {

	public static void main(String[] args) {
		Train train = new Train();
		System.out.println(train.trainName("Shatabdi Express"));
		System.out.println(train.color("Blue"));
		System.out.println(train.trainNum(453621));
		System.out.println(train.route("Mysore"));
		System.out.println(train.trainFair(150.9f));
		
		System.out.println();
		
		Metro metro = new Metro();
		System.out.println(metro.station("JP Nagar"));
		System.out.println(metro.noOfseats(170));
		System.out.println(metro.passangers((byte)98));
		System.out.println(metro.metroFair(30.00f));
		System.out.println(metro.color("Gray"));
		

	}

}
