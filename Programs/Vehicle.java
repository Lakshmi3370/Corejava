class Vehicle {
	String brand = "BMW";
}

class Car extends Vehicle {
	int cost = 5000;
	
	void start() {
		System.out.println("Car Started");
	}
}

class Bus extends Vehicle {
	String fuel = "Diesel";
	
	void stop() {
		System.out.println("Bus Stopped");
	}
}

class Driver {
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.brand+" "+c.cost);
		c.start();
		
		System.out.println("---------");
		
		Bus b = new Bus();
		System.out.println(b.brand+" "+b.fuel);
		b.stop();
	}
}