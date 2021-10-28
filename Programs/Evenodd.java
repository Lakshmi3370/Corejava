class Evenodd {
	public static void main(String[] args) {
		for(int a=0; a<args.length; a++){
			String number = args[a];
		
			int total = Integer.parseInt(number);
			System.out.print(total +"\t");
			
			byte t1 = Byte.parseByte(number);
			System.out.print(t1 +"\t");
			
			short t2 = Short.parseShort(number);
			System.out.print(t2 +"\t");
			
			long t3 = Long.parseLong(number);
			System.out.print(t3 +"\t");
			
			float t4 = Float.parseFloat(number);
			System.out.print(t4 +"\t");
			
		double t5 = Double.parseDouble(number);
			System.out.print(t5 +"\t");
			
			boolean t6 = Boolean.parseBoolean(number);
			System.out.print(t6 +"\t");
			

		}
	}
}
		