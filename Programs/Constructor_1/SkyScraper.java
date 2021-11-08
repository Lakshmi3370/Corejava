class SkyScraper {
String name;
String country;

SkyScraper(String n){
name = n;

}
SkyScraper(String n, String c){
	name =n;
	country = c;
}

String visit(){
	String type = name +"\t" + country;
	return type;
}
}