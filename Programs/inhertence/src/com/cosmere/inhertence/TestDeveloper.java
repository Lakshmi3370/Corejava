package com.cosmere.inhertence;

import com.cosmere.inhertence.dto.Developer;
import com.cosmere.inhertence.dto.Employee;

public class TestDeveloper {
public static void main(String[] args) {
	Developer developer = new Developer();
	System.out.println(developer.designation("Bigdata developer"));
	System.out.println(developer.company("IBM"));
	System.out.println(developer.salary(260000.56));
	System.out.println(developer.id((byte)101));
	System.out.println(developer.location("Bangalore"));
	
	System.out.println();
		
	
	Employee employee = new Employee();
	System.out.println();
	
	System.out.println(employee.name("Ram"));
	System.out.println(employee.id((byte)102));
	System.out.println(employee.salary(300000.78));
	System.out.println(employee.contactNum(7056423100l));
	System.out.println(employee.gender('M'));
}
}
