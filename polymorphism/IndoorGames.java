package com.cosmere.polymorphism.details;

public class IndoorGames extends Games{
	
	public void earningMoney() {
		System.out.println("We Can earn less money in Indoor Games");
		}
	
	public void anyTime() {
		System.out.println("We can play any time");
	}
	
	public void anyTime(byte time) {
		System.out.println("We have complete game within "+time+ " hours");
		
	}

}
