class Bank{
String name;
String location;
int balance;
String accountHolder;

String[] args = new String[4];

Bank(String[] args){
	System.out.println("-------");
	for (int i = 0; i<=args.length; i++){
		System.out.println(args[i]);
	}
}

Bank(String n){
name = n;
}

Bank(String n, String l, int b, String a){
this(n);
this.location = l;
this.balance = b;
this.accountHolder = a;
}

String printAll(){
	String display = name +"\t" + location + "\t" + balance +"\t" +accountHolder;
	return display;
}
}
