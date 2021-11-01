class TestFish{
	public static void main(String[] args){
		Fish f = new Fish();
		
		f.name  = "Shark";
		String fname = f.name;
		System.out.println(fname);
		
		f.color = "White";
		String fcolor = f.color;
		System.out.println(fcolor);
		
		f.height = 5.4;
		double fheight = f.height;
		System.out.println(fheight);
		
		f.weight = 10.5f;
		float fweight = f.weight;
		System.out.println(fweight+ " kgs");
		
		f.noOfFishes = 2;
		int fnoOfFishes = f.noOfFishes;
		System.out.println(fnoOfFishes);
		
	}
}