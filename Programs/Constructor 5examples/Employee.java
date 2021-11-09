class Employee {
String name;
byte id;
double salary;
long ph.no;

String[] args = new String[4];
Employee(String[] args){
	System.out.println("Developing App");
	for(int i = 0; i<=args.length; i++);
	System.out.println(args[i]);
}
}

Employee(String n){
	name = n;
}

Employee(String n, byte i; double s; long p){
	this(n);
	this.id = i;
	this.salary = s;
	this.ph.no = p;
}

String printAll(){
	String display=name+"\t "id+"\t "+salary+" \t"+ ph.no;
return display;
}
}
