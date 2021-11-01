class TestTextBook {
	public static void main(String[] args){
		TextBook tb = new TextBook();
		System.out.println(tb.subject);
		System.out.println(tb.noOfBook);
		System.out.println(tb.noOfPages);
		System.out.println(tb.noOflessons);
		double sum = tb.pages(10,20);
		System.out.println(sum);
		System.out.println(tb.lessonName("Intigration"));
		tb.sub(20.0, 3.1);
		
	}
}
		