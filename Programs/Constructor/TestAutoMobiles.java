class TestAutoMobiles {
	public static void main(String[] args) {
		AutoMobiles a = new AutoMobiles();
		
		a.type = "Car";
		System.out.println(a.type);
		
		a.brand = "Suzuki";
		System.out.println(a.brand);
		
		a.cost = 200000;
		System.out.println(a.cost);
		
		a.speed = 90.5f;
		System.out.println(a.speed+ " km");
	}
}