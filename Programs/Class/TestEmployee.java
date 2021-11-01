class TestEmployee {
	public static void main(String[] args){
		Employee e1 = new Employee();
		
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		
		e1.Developer();
		
		Employee e2 = new Employee();
		
		System.out.println(e2.name);
		System.out.println(e2.id);
		System.out.println(e2.age);
		System.out.println(e2.salary);
		
		e2.Tester();
	}
}