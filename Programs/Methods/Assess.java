class Assess {
	static String cricket(){
		System.out.println("T20 Match");
		byte a = 11;
		if(a==11){
			System.out.println("There are 11 players");//True
			return "Ball and Bat";
		}
			else{
			System.out.println("There are 12 players");//False
			String name = "M S Dhoni";
			return name;
			}
	}
	
	static String machine(){
		System.out.println("Low humming sound");
		short b = 10;
		if(b>=11){
			System.out.println("No. of drones");//False
			return "Fleye Drone";
			
		}
		else {
			System.out.println("Only one Drone");// True
String nam = "Aerotech";
return nam;			
}
	}
	
	static String pics(){
		System.out.println("Beautiful Pictures");
		int c = 13;
		if(c>=10){
			System.out.println("beautiful wallpapers");
			return "Camara";
		}
			else{
				String namm = "Vedio";
				return namm;
}
	}
	
	static String bangle(){
		System.out.println("Red Bangles");
		long d = 75l;
		if(d>=70){
			System.out.println("Red with Blue Bangles");//True
	return "dozzen";
	
		}
		else {
			String namb = "dozzens"; // False
		return namb;
	}
}
static String cloud(){
	System.out.println("Colorfull climate");//True
	float e = 10.5f;
	if (e<=11.5f){
		System.out.println("Today is cloudy");
		return "Sky";
	}
		else {
			String namc = "Rain";//False
		return namc;
		}
	}

static String sunrise(){
	System.out.println("Today sunrise was good");
	boolean f = true;
	if(f==true){
	System.out.println("Toady sunset will be good");
	return "Son";
}
	else {
		String nams = "Sunrise";
		return nams;
	}
}
	
static String stars(){
	System.out.println("So many stars");
	char g = 'S';
	if(g=='S'){
		System.out.println("Today sky is lloking good with stars");
		return "luminous stars";
	}
	else {
		String namd = "Moon";
return namd;
	}
}
}