class TestKeyboard {
	public static void main(String[] args) {
		Keyboard k1 = new Keyboard("Apple");
		String res = k1.typing();
		System.out.println(res);
		
		Keyboard k2 = new Keyboard("Apple", 10000);
		System.out.println(k2.typing());
	}
}
