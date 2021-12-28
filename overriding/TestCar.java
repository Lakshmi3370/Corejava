package com.cosmere.overriding;

import com.cosmere.overriding.details.Car;
import com.cosmere.overriding.details.Transport;

public class TestCar {

	public static void main(String[] args) {
		Car car=new Car();
		car.travelling();
		car.startCar();
		car.drive();
		car.stopCar();
		
		System.out.println();
		
		Transport transport=new Car();
		transport.travelling();

	}

}
