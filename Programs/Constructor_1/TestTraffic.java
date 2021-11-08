class TestTraffic {
	public static void main(String[] args) {
		Traffic t1 = new Traffic("Green");
		String res = t1.vehicle();
		System.out.println(res);
		
		Traffic t2 = new Traffic("Green", "Sound");
		System.out.println(t2.vehicle());
	}
}