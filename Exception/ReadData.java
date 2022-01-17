package com.cosmere.exception.block;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadData {

	public static void main(String[] args) throws Exception{

		/*FileReader fr = new FileReader("C:\\Users\\Lakshmi.DESKTOP-EA2CSFD\\Desktop\\Pattern Programs\\Test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str =br.readLine())!=null) {
			System.out.println(str);
		}
		
		System.out.println();*/
		
		try {
		FileReader fr1 = new FileReader("C:\\Users\\Lakshmi.DESKTOP-EA2CSFD\\Desktop\\Pattern Programs\\Test1.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		
		String str1;
		
		while((str1 =br1.readLine())!=null) {
			System.out.println(str1);
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("Give proper file path");
			System.out.println(e.getMessage());
		}
	}

}
