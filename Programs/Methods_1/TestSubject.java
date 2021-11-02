class TestSubject {
	public static void main(String[] args){
		
		String sval = Subject.read();
		System.out.println(sval);
		
		Subject s = new Subject();
		long sval1 = s.add();
		System.out.println(sval1);
	}
}