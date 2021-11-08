class Earphone {
	String brand; 
	String color;
	int cost;
	
	Earphone (String b){
		brand = b;
	}
	
	Earphone(String b, String cl, int c){
		brand = b;
	color = cl;
	cost = c;
}

String play(){
	String type = brand + "\t" + color +"\t" + cost;
	return type;
}
}