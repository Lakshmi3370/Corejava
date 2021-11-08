class TestHelmet{
	public static void main(String[] args) {
		
		Helmet h1 = new Helmet("Black");
		System.out.println(h1.wearing());
		
		Helmet h2 = new Helmet("Black", 300);
		System.out.println(h2.wearing());
	}
}
		
		