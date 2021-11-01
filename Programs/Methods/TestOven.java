class TestOven{
	static public void main (String[] args){
		Oven.bakeCake(15000);
		System.out.println(Oven.bakeCake(100.2f)+ " C");
		System.out.println(Oven.bakeCake("Cake"));
	}
}