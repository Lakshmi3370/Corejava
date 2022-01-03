package com.cosmere.metro;

import com.cosmere.metro.details.Metro;
import com.cosmere.metro.details.PurpleMetro;
import com.cosmere.metro.details.YellowMetro;

public class TestMetro {
	
	public static void main(String[] args) {
		
		PurpleMetro metro = new YellowMetro();
		System.out.println();
	    metro.yellowLine();
	    metro.purpleLine();
	    metro.greenLine();
	    
	    System.out.println();
	   
	    System.out.println(Metro.color);
	    System.out.println(metro.time);
	    
	    System.out.println();
	    
	    YellowMetro yl = new YellowMetro();
	    System.out.println();
	    yl.purpleLine();
	    yl.greenLine();
	    yl.yellowLine();
	    
	
	}

}
