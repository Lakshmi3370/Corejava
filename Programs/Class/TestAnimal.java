class TestAnimal {
	public static void main(String[] args){
		Animal a = new Animal();
		String animalname = a.name;
		System.out.println(animalname);
		System.out.println(a.height);
		System.out.println(a.color);
		System.out.println(a.eyes);
		System.out.println(a.legs);
		a.eat();
		a.act("walk");
	}
}