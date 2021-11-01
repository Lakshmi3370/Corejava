class Switch{
	static String wire(){
		return "Plug";
	}
	static void wire(int volts, int amps){
		System.out.println(volts+ " Volts " +amps+ " Amps");
	}
	static void wire(String name){
		System.out.println(name);
	}
}