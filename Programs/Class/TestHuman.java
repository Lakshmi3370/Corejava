class TestHuman {
	public static void main(String[] args){
		Human h = new Human();
		System.out.println(h.height);
		System.out.println(h.weight);
		System.out.println(h.noOfLegs);
		System.out.println(h.noOfHands);
		System.out.println(h.walk("Anamika"));
		h.run(400);
	}
}