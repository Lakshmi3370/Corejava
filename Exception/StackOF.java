package com.cosmere.exception.block;

public class StackOF {
	
	StackOF(){
		try {
			StackOF stackof = new StackOF();
			}
			catch(StackOverflowError e) {
				e.printStackTrace();
			}
	}
	
	StackOF(int x, int y){
	this();
	}
	
	
	
	public static void main(String[] args) {
		StackOF stackof = new StackOF();

	}

}
