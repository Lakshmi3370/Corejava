package com.cosmere.inhertence.dto;

public class Table extends Wood {
	String color;
	int price;
	float height;
	float width;
	float length;

	
		public Table() {
			System.out.println("Invoking Table details");
		}
		
		public String color(String color) {
			return this.color=color;
		}
		public int price(int price) {
			return this.price=price;
		}
		
		public float height(float height) {
			return this.height=height;
		}
		public float width(float width) {
			return this.width=width;
		}
			public float length(float length) {
				return this.length=length;
			
	}
}
