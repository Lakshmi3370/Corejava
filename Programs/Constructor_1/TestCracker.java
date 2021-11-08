class TestCracker {
	public static void main(String[] args) {
		Cracker c1 = new Cracker("Rocket");
		System.out.println(c1.fire());
		
		Cracker c2 = new Cracker("Rocket", 150.00);
		System.out.println(c2.fire());
	}
}