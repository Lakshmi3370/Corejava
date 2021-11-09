class TestEmployee {
	public static void main(String[] args){
Employee e1=new Employee(args);

Employee e2=new Employee("Tom");
String res=e2.printAll();
System.out.println(res);

byte id = 101;
double salary=20000.00;
long ph.no = 709652234L;
Employee e3=new Employee("Tony",id,salary,ph.no);
String result=e3.printAll();
System.out.println(result);
}
} 