class TestPlant {
	public static void main(String[] args){
		Plant mp = new Plant();
		String plantname = mp.name;
		System.out.println(plantname);
		mp.grow();
		String res= mp.obsorbCo2();
		System.out.println(res);
	}
}