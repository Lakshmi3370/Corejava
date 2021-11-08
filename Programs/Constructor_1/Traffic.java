class Traffic {
	String light;
	String polution;
	
	Traffic(String l){
		light = l;
	}
	
	Traffic (String l, String p){
light = l;
polution = p;
	}
String vehicle(){
String display = light +"\t" + polution;
return display;
}
}