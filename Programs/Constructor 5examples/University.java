class University {
	
	String name;
	String location;
	int code;
	
	
	String[] args = new String[4];
Employee(String[] args){
	System.out.println("The top University");
	for(int i = 0; i<=args.length; i++);
	System.out.println(args[i]);
}
}

Employee(String n){
	name = n;
}

Employee(String n, String l; int c){
	this(n);
	this.location = l;
	this.code = c;
	
}

String printAll(){
	String display=name+"\t "location+"\t "+code;
return display;
}
}
