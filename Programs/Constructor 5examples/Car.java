class Car {
	String brand;
	String color;
	long price;
	short seats;
	String[] args=new String[4];
Car(String []args){
	System.out.println("Car Started");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}

Car(String b){
brand=b;
}

Car(String b,String c, long p, short s){
this(b);
this.color=c;
this.price=p;
this.seats=s;
}
String printAll(){
String display=brand+"\t "+color+"\t "+price+" \t"+seats;
return display;
}
}
	