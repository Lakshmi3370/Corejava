class TestWater {
	public static void main(String[] args) {
		
		Water.drink();
		Water w = new Water();
		
		int vals = Water.drink();
		System.out.println(vals);
		
	 String vals1 = w.wash();
		System.out.println(vals1);
	}
}