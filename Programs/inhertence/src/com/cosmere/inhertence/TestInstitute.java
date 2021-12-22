package com.cosmere.inhertence;

import com.cosmere.inhertence.dto.Institute;
import com.cosmere.inhertence.dto.Xworkz;

public class TestInstitute {

	public static void main(String[] args) {
		Institute institute = new Institute();
		System.out.println(institute.name("Xworkz"));
		System.out.println(institute.location("Bangalore"));
		System.out.println(institute.noOfstaffs((short)10));
		System.out.println(institute.area("Rajajinagar"));
		System.out.println("Offline Batch");
		
		System.out.println();
		
		Xworkz xworkz = new Xworkz();
		System.out.println(xworkz.address("Bangalore, Rajajinagar, 2nd stage, 560010"));
		System.out.println(xworkz.noOfStudents(100));
		System.out.println(xworkz.noOfclassRooms((byte)4));
		System.out.println(xworkz.course("JAVA"));
		System.out.println(xworkz.noOfBranches((short)2));
	}

}
