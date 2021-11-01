class TestOrganism{
	public static void main(String[] args){
		Organism o = new Organism();
		
		o.type = "Ant";
		String otype = o.type;
		System.out.println(otype);
		
		o.color = "Red";
		String ocolor = o.color;
		System.out.println(ocolor);
		
		o.size = 0.8f;
		float osize = o.size;
		System.out.println(osize);
		
	}
}