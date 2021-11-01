class TestCar {
	public static void main(String[] args){
		Car c = new Car();
		
		System.out.println(c.brand);
		System.out.println(c.cost);
		System.out.println(c.color);
		
		c.start();
		c.stop();
	}
}
		
		