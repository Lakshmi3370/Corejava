package com.cosmere.finalKeyword;

public final class FinalClass {
	
	static int a=10; 
	static int b=20;
	
	//Can not achieve IS-A relation
	public class Test extends FinalClass{
		
		public static void main(String[] args) {
			System.out.println(a+ " "+b);
		}
	}

}
