package com.cosmere.gun.details;

public class BulletDTO {
	private byte mm;
	private byte grams;
	private float cost;
	
	 public void setMm(byte mm) {
	    	this.mm=mm;
	    }
	    
	    public byte getMm() {
	    	return mm;
	    }
	    
	    public void setGrams(byte grams) {
	    	this.grams=grams;
	    }
	    
	    public byte getGrams() {
	    	return grams;
	    }
	    
	    public void setCost(float cost) {
	    	this.cost=cost;
	    }
	    
	    public float getCost() {
	    	return cost;
	    }
	    public String toString() {
	    	return getClass().getSimpleName()+ mm+ "\t "+grams+ "\t " +cost;
	    }
}
