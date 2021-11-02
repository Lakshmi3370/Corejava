class TestStudent1 {
	public static void main(String[] args){
		
		char sval = Student.grade();
		System.out.println(sval);
		
		Student s = new Student();
		float sval1 = s.percent();
		System.out.println(sval1);
	}
}