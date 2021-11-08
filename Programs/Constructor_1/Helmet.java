class Helmet {
	
	String color;
	int cost;
	 
	 Helmet(String c){
		 color = c;
	 }
	 Helmet(String c, int co){
		 color = c;
		 cost = co;
	 }
	 
	 String wearing(){
		 String type = color +"\t" + cost;
		 return type;
	 }
}