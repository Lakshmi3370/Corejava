package com.xworkz.examples;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDate obj = LocalDate.now();
		System.out.println(obj);
		System.out.println();
		System.out.println(obj.getYear());
		System.out.println(obj.getDayOfMonth());
		System.out.println(obj.getDayOfWeek());
		System.out.println(obj.getMonthValue());
		System.out.println(obj.getDayOfYear());


		System.out.println();
		
		LocalTime myobj = LocalTime.now();
		System.out.println(myobj);
		System.out.println(myobj.getNano());


	}

}
