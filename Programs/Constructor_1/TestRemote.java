class TestRemote {
	public static void main(String[] args) {
		Remote r1 = new Remote ("BPL");
		System.out.println(r1.play());
		Remote r2 = new Remote ("BPL", "Gray", 150);
		System.out.println(r2.play());
	}
}
		