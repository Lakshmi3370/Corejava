package com.cosmere.polymorphism.details;

public class OutdoorGames extends Games {
	
	public void earningMoney() {
		System.out.println("We Can earn good amount than in Indoor Games");
		}
	
	public void gameTime() {
		System.out.println("We have perticular time to play outdoor games");
	}
public void gameTime(String date, byte time) {	
	System.out.println("Game will start on "+date+ " at "+time+ "pm");
}
}
