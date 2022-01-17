package com.cosmere.finalKeyword;

public class FinalVariable {
	
public static void main(String[] args) {
	
	//without final keyword:
	int i = 5;
	i++;
	i=7;
	System.out.println(i);
	
	//with final keyword:
// Can not modify the value;
	final int j = 5;
	//j++;
	System.out.println(j);

   }
}
