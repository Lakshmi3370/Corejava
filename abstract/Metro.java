package com.cosmere.metro.details;

public abstract class Metro {
	
	public static String color = "green";
	public String time;

	public Metro() {
		System.out.println("Implementing Green Metro");
		
		
	}
	
	void greenLine() {
		System.out.println("Strting from Nagasandra to Yelachenahalli");
	}
	
	abstract void purpleLine();
	
	
}


