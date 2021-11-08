class Keyboard {
String name;
int cost;

Keyboard(String n){
	name = n;
}



String typing(){
	String type = name + "\t" + cost;
	return type;
}
	Keyboard(String n, int c){
	name = n;
	cost = c;

}
}