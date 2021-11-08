class TestSkyScraper {
	public static void main(String[] args) {
		SkyScraper s1 = new SkyScraper("Burj Khalifa");
		System.out.println(s1.visit());
		
		SkyScraper s2 = new SkyScraper("Burj Khalifa","Dubai");
		System.out.println(s2.visit());
	}
}
		