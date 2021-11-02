class TestPhone {
	public static void main(String[] args) {
		
		String val1 = Phone.message();
		System.out.println(val1);
		
		Phone p = new Phone();
		double val2 = p.data();
		System.out.println(val2+ " gb");
	}
}