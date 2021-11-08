class Trekking {
	
	String place;
	double distance;
	
	Trekking(double d){
		distance = d;
	}
	Trekking(String p, double d){
		place = p;
	 distance = d;
	}
	
	String walk(){
		String type = place +"\t" + distance;
		return type;
	}
}