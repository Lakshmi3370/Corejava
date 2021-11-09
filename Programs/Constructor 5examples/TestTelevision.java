class TestTelevision {
	public static void main(String[] args){
Television t1=new Television(args);

Television t2=new Television("Sony");
String res=t2.printAll();
System.out.println(res);

int cost=20000;
float size = 13.5f;
Television t3=new Television("LG",cost,size,"LED");
String result=t3.printAll();
System.out.println(result);
}
} 