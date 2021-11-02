class TestOffice {
	public static void main(String[] args){
		
		double sval = Office.login();
		System.out.println(sval+ " am");
		
		Office o = new Office();
		double sval1 = o.logout();
		System.out.println(sval1 + " pm");
	}
}