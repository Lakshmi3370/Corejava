class Workshop {
String subject;
String place;
float area;

Workshop(String s){
	subject = s;
}

Workshop(String s, String p, float a){
	subject = s;
	place = p;
	area = a;
}
	String work(){
		String type = subject + "\t" + place +"\t" + area;
	return type;
}
}
	
