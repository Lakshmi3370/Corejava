class Car {
	public static void main(String[] args) {
		for (int i=0; i<args.length; i++){
			String name = args[i];
			System.out.print(name +"\t");
			int f1 = Integer.parseInt(name);
			System.out.println(f1);
		}
		for (int i=0; i<args.length; i++){
			String name = args[i];
			System.out.print(name +"\t");
			byte f2 = Byte.parseByte(name);
			System.out.println(f2);
		}
		for (int i=0; i<args.length; i++){
			String name = args[i];
			System.out.print(name +"\t");
			short f3 = Short.parseShort(name);
			System.out.println(f3);
		}
        for (int i=0; i<args.length; i++){
			String name = args[i];
			System.out.print(name +"\t");
			long f4 = Long.parseLong(name);
			System.out.println(f4);
		}
		for (int i=0; i<args.length; i++){
			String name = args[i];
			System.out.print(name +"\t");
			boolean f5 = Boolean.parseBoolean(name);
			System.out.println(f5);
		}
	
		for (int i=0; i<args.length; i++){
			String name = args[i];
			System.out.print(name +"\t");
			float f6 = Float.parseFloat(name);
			System.out.println(f6);
		}
		for (int i=0; i<args.length; i++){
			String name = args[i];
			System.out.print(name +"\t");
			double f7 = Double.parseDouble(name);
			System.out.println(f7);
		}
	}
}