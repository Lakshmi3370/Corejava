package com.cosmere.calculator;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Calculation cal=new Calculation();
		System.out.println();
		cal.add();
		cal.sub();
		cal.Multi();
		cal.div();
		
		System.out.println();

		
     while(true) {
    	 
		Scanner sc = new Scanner(System.in);
		
		//Calculating Integer values;
		System.out.println("Enter 1st num1");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd num2");
		int num2 = sc.nextInt();
		
		int result = num1+num2;	
		int result1 = num2-num1; 
		int result2 = num2*num1; 
		int result3 = num2/num1; 
		System.out.println("addition: "+result);
		System.out.println("subtraction: "+result1);
		System.out.println("multiplication: "+result2);
		System.out.println("division: "+result3);
		
		//Calculating Byte values;
		System.out.println("Enter 1st num3");
		byte num3 = sc.nextByte();
		System.out.println("Enter 2nd num4");
		byte num4 = sc.nextByte();
		
		byte res = (byte) (num3+num4);	
		byte res1 = (byte) (num4-num3); 
		byte res2 = (byte) (num3*num4); 
		byte res3 = (byte) (num4/num3); 
		System.out.println("addition: "+res);
		System.out.println("subtraction: "+res1);
		System.out.println("multiplication: "+res3);
		System.out.println("division: "+res3);
	
		//Calculating Short values;
		System.out.println("Enter 1st num5");
		short num5 = sc.nextShort();
		System.out.println("Enter 1st num6");
		short num6 = sc.nextShort();

		short short_res = (short) (num5+num6);	
		short short_res1 = (short) (num5-num6); 
		short short_res2 = (short) (num5*num6); 
		short short_res3 = (short) (num5/num6); 
		System.out.println("addition: "+short_res);
		System.out.println("subtraction: "+short_res1);
		System.out.println("multiplication: "+short_res3);
		System.out.println("division: "+short_res3);
		
		//Calculating Long values;
				System.out.println("Enter 1st num7");
				long num7 =sc.nextLong();
				System.out.println("Enter 1st num8");
				long num8 = sc.nextLong();

				long long_res = (num7+num8);	
				long long_res1 = (num7-num8); 
				long long_res2 = (num7*num8); 
				long long_res3 = (num7/num8); 
				System.out.println("addition: "+long_res);
				System.out.println("subtraction: "+long_res1);
				System.out.println("multiplication: "+long_res3);
				System.out.println("division: "+long_res3);
				
				//Calculating Float value
				System.out.println("Enter 1st num9");
				float num9 =sc.nextFloat();
				System.out.println("Enter 1st num10");
				float num10 = sc.nextFloat();

				float float_res = (num9+num10);	
				float float_res1 = (num9-num10); 
				float float_res2 = (num9*num10); 
				float float_res3 = (num9/num10); 
				System.out.println("addition: "+float_res);
				System.out.println("subtraction: "+float_res1);
				System.out.println("multiplication: "+float_res3);
				System.out.println("division: "+float_res3);

				//Calculating Double value
				System.out.println("Enter 1st num11");
				double num11 =sc.nextDouble();
				System.out.println("Enter 1st num12");
				double num12 = sc.nextDouble();

				double double_res = (num11+num12);	
				double double_res1 = (num11-num12); 
				double double_res2 = (num11*num12); 
				double double_res3 = (num11/num12); 
				System.out.println("addition: "+double_res);
				System.out.println("subtraction: "+double_res1);
				System.out.println("multiplication: "+double_res3);
				System.out.println("division: "+double_res3);
				
	System.out.println("Enter Choice");
		int choice=sc.nextInt();
	   switch(choice) {
	case 1: System.out.println("Enter 1st choice value");
     break;
	case 2: System.out.println("Enter 2nd choice value");
	break;
	case 3:System.exit(0);
		default:
			System.out.println("Enter valid numbers");
				
	   }
     }
			
	}
     }
	
		
			
			
	




