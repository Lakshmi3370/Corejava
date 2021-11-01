class TextBook{
	int noOfPages = 128;
	String subject = "Maths";
	byte noOfBook = 1;
	short noOflessons = 20;
	
	double pages(int a, int b){
		return a+b+1.5;
		
	}
	
	String lessonName(String name){
		return name;
	}
	
	void sub(double x, double y ){
		System.out.println(x*y);
	}
}