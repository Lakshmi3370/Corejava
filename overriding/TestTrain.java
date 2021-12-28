package com.cosmere.overriding;

import com.cosmere.overriding.details.Train;
import com.cosmere.overriding.details.Transport;

public class TestTrain {

	public static void main(String[] args) {
		Train train = new Train();
		train.travelling();
		train.startBus();
		train.drive();
		train.stopBus();
		
		System.out.println();
		
		Transport transport= new Train();
		transport.travelling();
	}

}
