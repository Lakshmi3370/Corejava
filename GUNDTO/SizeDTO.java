package com.cosmere.gun.details;

public class SizeDTO {
	
    private float length;
    private float weight;

    public void setLength(float length) {
    	this.length=length;
    }
    
    public float getLength() {
    	return length;
    }
    
    public void setWeight(float weight) {
    	this.weight=weight;
    }
    
    public float getWeight() {
    	return weight;
    }
    public String toString() {
    	return getClass().getSimpleName()+ length+ "\t "+weight;
    }
}
