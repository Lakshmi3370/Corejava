package com.cosmere.overriding;

import com.cosmere.overriding.details.Transport;
import com.cosmere.overriding.details.Truck;

public class TestTruck {

	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.travelling();
		truck.drive();
		
		System.out.println();
		
		Transport transport= new Truck();
		transport.travelling();
	}

}
