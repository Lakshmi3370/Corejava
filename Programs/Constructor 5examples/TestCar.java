class TestCar {
	public static void main(String[] args){
Car c1=new Car(args);

Car c2=new Car("BMW");
String res=c2.printAll();
System.out.println(res);

long price=2000000l;
short seats=5;

Car c3=new Car("Audi","Red",price,seats);
String result=c3.printAll();
System.out.println(result);
}
} 