package com.cosmere.mobile;

import com.cosmere.mobile.dto.Phone;
import com.cosmere.mobile.dto.Vivo;

public class PhoneTester {

	public static void main(String[] args) {
		
		Phone phone= new Phone();
		
		System.out.println();
		System.out.println(phone.brand("Oppo"));
		System.out.println(phone.price(10000));
		System.out.println(phone.series("A15s"));
		System.out.println(phone.pxl((byte)12));
		System.out.println(phone.color("Gold"));
		
		System.out.println("-----");
		
		Vivo vivo =new Vivo();
		
		System.out.println();
		System.out.println(vivo.cost(15000));
		System.out.println(vivo.ram((byte)4));
		System.out.println(vivo.rom((byte)128));
		System.out.println(vivo.model("V9"));
		System.out.println(vivo.color("Blue"));
		

	}

}
