class TestUniversity {
	public static void main(String[] args){
University u1=new University(args);

University u2=new University("VTU");
String res=u2.printAll();
System.out.println(res);


int code = 100;
University u3=new University("VTU","Bangalore" code);
String result=u3.printAll();
System.out.println(result);
}
} 