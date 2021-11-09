class Television {
String brand;
int cost;
float size;
String type;

String[] args = new String[4];
Television(String[] args){
	System.out.println("Watching movie");
	for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
Television(String b){
brand = b;
}

Television(String b,int c, float s, String t){
this(b);
this.cost=c;
this.size=s;
this.type=t;
}
String printAll(){
String display=brand+"\t "+cost+"\t "+size+" \t"+type;
return display;
}
}
	