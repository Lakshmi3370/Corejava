package com.cosmere.statickeyword;

public class Board {
	static String type = "Wood";
	static float hight = 10.5f;
	
	//Overloading using static keyword;
	
	static int write(int num) {
		System.out.println("Having only one board to write");
		return num;
	}
	
	static String write(String color, String marker) {
		System.out.println("Writing on the white board");
		return color+ " " +marker;
	}
	
	public static void main(String[] args) {
		System.out.println(Board.type);
		System.out.println(Board.hight);
		System.out.println();
		System.out.println(Board.write(1));
		System.out.println();
		System.out.println(Board.write("White", "Red Marker"));
		

	}

}
