class TestWorkshop {
	public static void main(String[] args) {
		Workshop w1 = new Workshop("Mechanical");
		System.out.println(w1.work());
		
		Workshop w2 = new Workshop("Mechanical", "Bagalore", 1200.00f);
		System.out.println(w2.work());
	}
}