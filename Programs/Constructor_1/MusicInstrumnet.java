class MusicInstrumnet {
String name;
String color;
int cost; 

MusicInstrumnet(int c){
	cost = c;
}
MusicInstrumnet(String n, String cl, int c){
	name = n;
	color = cl;
	cost = c;
}

String music(){
	String type = name + "\t" + color +"\t" + cost;
	return type;
}
}