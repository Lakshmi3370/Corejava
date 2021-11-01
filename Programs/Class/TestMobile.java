class TestMobile {
	public static void main(String[] args){
		
		Mobile m = new Mobile();
		
		System.out.println(m.brand);
		System.out.println(m.cost);
		System.out.println(m.color);
		System.out.println(m.RAM+ " gb");
		
		m.message();
		System.out.println(m.call());
	}
}
		