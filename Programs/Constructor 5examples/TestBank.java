class TestBank {
	public static void main(String[] args){
Bank b1=new Bank(args);

Bank b2=new Bank("SBI");
String res=b2.printAll();
System.out.println(res);



Bank b3=new Bank("Axis","Rajajinagar",20000,"Lakshmi");
String result=b3.printAll();
System.out.println(result);
}
} 