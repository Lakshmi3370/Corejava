class TestTester {
	public static void main(String[] args){
		
		boolean tval = Tester.debug();
		System.out.println(tval);
		
		Tester t = new Tester();
		boolean tval1 = t.testing();
		System.out.println(tval1);
	}
}