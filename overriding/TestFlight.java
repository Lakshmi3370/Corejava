package com.cosmere.overriding;

import com.cosmere.overriding.details.Flight;
import com.cosmere.overriding.details.Transport;

public class TestFlight {

	public static void main(String[] args) {
		Flight flight = new Flight();
		flight.travelling();
		flight.drive();
		
       System.out.println();
		
		Transport transport= new Flight();
		transport.travelling();

	}

}
