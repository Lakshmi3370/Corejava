package com.cosmere.overriding;

import com.cosmere.overriding.details.Bus;
import com.cosmere.overriding.details.Transport;

public class TestBus {

	public static void main(String[] args) {
		Bus bus=new Bus();
		
		bus.travelling();
		bus.startBus();
		bus.drive();
		bus.stopBus();
		
		System.out.println();
		
		Transport transport=new Bus();
		transport.travelling();
		
	}

}
