package com.cosmere.gun.details;

public class GunDetails {

	private String name;
	private String color;
	private double price;
	private SizeDTO size;
	private BulletDTO bullet; 
    private TypeDTO type;
    
    public void setName(String name) {
    	this.name= name;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setColor(String color) {
    	this.color= color;
    }
    
    public String getColor() {
    	return color;
    }
    public void setPrice(double price) {
    	this.price= price;
    }
    
    public double getPrice() {
    	return price;
    }
    public void setSize(SizeDTO size) {
    	this.size= size;
    }
    
    public SizeDTO getSize() {
    	return size;
    }
    public void setBullet(BulletDTO bullet) {
    	this.bullet= bullet;
    }
    
    public BulletDTO getBullet() {
    	return bullet;
    }
    public void setType(TypeDTO type) {
    	this.type= type;
    }
    
    public TypeDTO getType() {
    	return type;
    }
    
    public String toString() {
    	return getClass().getSimpleName()+ name+ "\t "+color+ "\t " +price+ "\t " +size+ "\t "+bullet+ "\t "+type;
    }
	
}
