class TestPen {
	public static void main(String[] args){
		Pen p = new Pen();
		System.out.println(p.name);
		System.out.println(p.price+ " Rs");
		System.out.println(p.height);
		System.out.println(p.color);
		System.out.println(p.totalpens);
		p.writing();
		String result = p.sketch();
		System.out.println(result);
		
	}
}