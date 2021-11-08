class Remote {
	String name; 
	String color;
	int cost;
	
	Remote (String n){
		name = n;
	}
	
	Remote (String n, String cl, int c){
		name = n;
	color = cl;
	cost = c;
}

String play(){
	String type = name + "\t" + color +"\t" + cost;
	return type;
}
}