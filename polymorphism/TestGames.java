package com.cosmere.polymorphism;

import com.cosmere.polymorphism.details.Games;
import com.cosmere.polymorphism.details.IndoorGames;
import com.cosmere.polymorphism.details.OutdoorGames;

public class TestGames {

	public static void main(String[] args) {

		OutdoorGames outdoorgame = new OutdoorGames();
		outdoorgame.earningMoney();
		outdoorgame.entertain();
		outdoorgame.gameTime();
		outdoorgame.gameTime("07/01/2022", (byte)4);
		
		System.out.println();
		
		IndoorGames indoorgame = new IndoorGames();
		indoorgame.earningMoney();
		indoorgame.entertain();
		indoorgame.anyTime();
		indoorgame.anyTime((byte)3);
		
		System.out.println();
		
		Games game = new Games();
		game.earningMoney();
		game.entertain();
		
		
	}

}
