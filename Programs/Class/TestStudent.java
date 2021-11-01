class TestStudent {
	public static void main(String[] args){
		Student s = new Student();
		
		String sname = s.name;
		System.out.println(sname);
		System.out.println(s.id);
		System.out.println(s.age);
		
		String suname = s.school();
		System.out.println(suname);
		
		System.out.println(s.sports(10));
		
	}
}