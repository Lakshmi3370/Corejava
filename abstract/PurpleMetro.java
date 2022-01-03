package com.cosmere.metro.details;

	public abstract class PurpleMetro extends Metro {
		
		public PurpleMetro() {
		System.out.println("Implementing Purple Metro");
	
		}
		
		@Override
		public void greenLine() {
			System.out.println("Strting from Nagasandra to Yelachenahalli");
		}
		
		@Override
	   public void purpleLine() {
		System.out.println("Strting from Baiyappanahalli to Mysore Road");
	}

		public abstract void yellowLine();


	}

