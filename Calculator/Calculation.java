package com.cosmere.calculator;

public class Calculation extends Calculator{
	
  Calculation() {
	 this("Maths");
			System.out.println("Invoking all calculation");
	}
  Calculation(String sub){
		System.out.println("Subject is "+sub);
  }
  
	
    public void add() {
    	System.out.println("Calculating addition");
    }
	
	public void sub() {
    	System.out.println("Calculating subtraction");

	}

	public void Multi() {
    	System.out.println("Calculating multiplication");

	}

	public void div() {
    	System.out.println("Calculating division");
    	
	}

	 

}
