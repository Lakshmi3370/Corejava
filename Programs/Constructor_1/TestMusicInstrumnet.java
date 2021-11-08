class TestMusicInstrumnet {
	public static void main(String[] args) {
		MusicInstrumnet m1 = new MusicInstrumnet(12000);
		String res = m1.music();
		System.out.println(res);
		
		MusicInstrumnet m2 = new MusicInstrumnet("Buzz", "Black", 12000);
		System.out.println(m2.music());
	}
}