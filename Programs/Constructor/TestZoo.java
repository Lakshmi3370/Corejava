class TestZoo {
	public static void main(String[] args){
		Zoo z = new Zoo();
		
		z.name = "Monkeys Zoo";
		String zname = z.name;
		System.out.println(zname);
		
		z.place = "Mysore";
		String zpalce = z.place;
		System.out.println(zpalce);
		
		z.noOfZoo= 1;
		int znoOfZoo = z.noOfZoo;
		System.out.println(znoOfZoo);
	}
}