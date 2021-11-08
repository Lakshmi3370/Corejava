class Cracker {
	 String name;
	 double cost;
	 
	 Cracker (String name){
		 
	 }
	 
	 Cracker (String n, double c){
		 name = n;
		 cost = c;
	 }
	 
	 String fire(){
		 String type = name + "\t" + cost;
		 return type;
	 }

}
	 