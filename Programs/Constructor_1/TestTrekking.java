class TestTrekking{
	public static void main(String[] args) {
		
		Trekking t1 = new Trekking(125.5);
		System.out.println(t1.walk());
		
		
		Trekking t2 = new Trekking("Nadi Hills", 125.5);
		System.out.println(t2.walk());
	}
}
		
		