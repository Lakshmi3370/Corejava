package com.cosmere.exception.block;

public class NullPE {
	
	String[] str = new String[]  {"Java", "Sql","HTML","CSS",null,"Javascript"};

	public static void main(String[] args) {
		NullPE nullpe = new NullPE();
		
		System.out.println(nullpe.str[0].toUpperCase());
		System.out.println(nullpe.str[1].toUpperCase());
		System.out.println(nullpe.str[2].toUpperCase());
		System.out.println(nullpe.str[3].toUpperCase());
		try {
		System.out.println(nullpe.str[4].toUpperCase());
		}
		catch (NullPointerException e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		System.out.println(nullpe.str[5].toUpperCase());

	}

}
