class TestKingdom {
	public static void main(String[] args) {
		Kingdom k = new Kingdom();
		
		k.name = "Magadha";
		String kname = k.name;
		System.out.println(kname);
		
		k.totalKingdom = 16l;
		long ktotalKingdom = k.totalKingdom;
		System.out.println(ktotalKingdom);
		
		k.place = "Patna";
		String kplace = k.place;
		System.out.println(kplace);
	}
}
		