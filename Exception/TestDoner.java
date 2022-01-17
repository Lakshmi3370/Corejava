package com.cosmere.enums;

import com.cosmere.enums.dao.DonerOpertation;
import com.cosmere.enums.dto.BloodGroup;
import com.cosmere.enums.dto.ContactDetails;
import com.cosmere.enums.dto.DonerDTO;
import com.cosmere.enums.dto.Gender;

public class TestDoner {
	
public static void main(String[] args) {
	DonerDTO dto = new DonerDTO();
	dto.setName("Lakshmi");
	dto.setAge((byte)24);
	dto.setWeight(42.4f);
	dto.setBg(BloodGroup.AB_NEGATIVE);
	dto.setGender(Gender.FEMALE);
	
	DonerDTO dto1 = new DonerDTO();
	dto1.setName("Sandya");
	dto1.setAge((byte)25);
	dto1.setWeight(57.54f);
	dto1.setBg(BloodGroup.AB_POSITIVE);
	dto1.setGender(Gender.FEMALE);
	
	DonerDTO dto2 = new DonerDTO();
	dto2.setName("Varun");
	dto2.setAge((byte)27);
	dto2.setWeight(59.9f);
	dto2.setBg(BloodGroup.A_POSITIVE);
	dto2.setGender(Gender.MALE);
	
	DonerDTO dto3 = new DonerDTO();
	dto3.setName("Rakesh");
	dto3.setAge((byte)24);
	dto3.setWeight(58.3f);
	dto3.setBg(BloodGroup.A_NEGATIVE);
	dto3.setGender(Gender.MALE);
	
	DonerDTO dto4 = new DonerDTO();
	dto4.setName("Kavita");
	dto4.setAge((byte)27);
	dto4.setWeight(48.7f);
	dto4.setBg(BloodGroup.O_POSITIVE);
	dto4.setGender(Gender.FEMALE);
	
	ContactDetails contactdetails = new ContactDetails();
	contactdetails.setContactNum(9877332144l);
	contactdetails.setEmail("lakshmi987@gmail.com");
	contactdetails.setAddress("Bangalore");
	
	ContactDetails contactdetails1 = new ContactDetails();
	contactdetails1.setContactNum(9872329384l);
	contactdetails1.setEmail("sandya54@gmail.com");
	contactdetails1.setAddress("Bangalore");
	
	ContactDetails contactdetails2 = new ContactDetails();
	contactdetails2.setContactNum(7019329384l);
	contactdetails2.setEmail("varun43@gmail.com");
	contactdetails2.setAddress("Bangalore");
	
	ContactDetails contactdetails3 = new ContactDetails();
	contactdetails3.setContactNum(9872329384l);
	contactdetails3.setEmail("rakesh4354@gmail.com");
	contactdetails3.setAddress("Bangalore");
	
	ContactDetails contactdetails4 = new ContactDetails();
	contactdetails4.setContactNum(9841429384l);
	contactdetails4.setEmail("kavita1994@gmail.com");
	contactdetails4.setAddress("Bangalore");
	
	dto.setDetails(contactdetails);
	dto1.setDetails(contactdetails1);
	dto2.setDetails(contactdetails2);
	dto3.setDetails(contactdetails3);
	dto4.setDetails(contactdetails4);
	
	DonerOpertation operation = new DonerOpertation();
	
	operation.save(dto);
	operation.save(dto1);
	operation.save(dto2);
	operation.save(dto3);
	operation.save(dto4);
	
	operation.printAll();
	System.out.println();
	
	try {
	System.out.println("get by gender");
    DonerDTO res = operation.getByGender(Gender.FEMALE);
    System.out.println(res.toString());
    System.out.println();
	}
	catch(NullPointerException np) {
		System.err.println(np.getMessage())	;
	}
	
    try {
    System.out.println("get by bloodgroup");
    DonerDTO res1 = operation.getByGender(Gender.FEMALE);
    System.out.println(res1.toString());
    }
    catch(NullPointerException np) {
		System.err.println(np.getMessage())	;
	}
    catch(ArrayIndexOutOfBoundsException ai) {
    	System.err.println(ai.getMessage());
    }
    finally {
		System.out.println("get the blood from person");
	}
    System.out.println();
    try {
    System.out.println("updat contact number by name");
    DonerDTO update = operation.updateContactByName("Lakshmi", 7832113420l);
    System.out.println(update.toString());
    System.out.println();
    operation.printAll();
    }
    catch(NullPointerException np) {
		System.out.println(np.getMessage())	;
	}
    System.out.println();
    
    System.out.println("get all by array");
    DonerDTO[] all = operation.getByAllGender(Gender.MALE);
	for(int index=0; index<all.length; index++) {
		 try {
	    System.out.println(all[index]);
	}
	catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage())	;
	}
	    System.out.println();

	    System.out.println("get bloodgroup by arry");
	    DonerDTO[] result = operation.getByAllBg(BloodGroup.AB_NEGATIVE);
		for(int i=0; i<result.length; i++) {
			try {
		    System.out.println(result[i]);
			}
		    catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage())	;
			}
			
		    System.out.println();

		  }
		}
    }
}
