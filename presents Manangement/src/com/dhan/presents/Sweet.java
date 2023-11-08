package com.dhan.presents;

public abstract class Sweet {

	
//	Here I just Declared the three variables
	private String name;
	private double weight;
	private double sugarWeight;
	
//	Below are the getters and setters for the above variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight; 
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSugarWeight() {
		return sugarWeight;
	}
	public void setSugarWeight(double sugarWeight) {
		this.sugarWeight = sugarWeight;
	}
	@Override
	public String toString() {
		return "Sweet [name=" + name + ", weight=" + weight + ", sugarWeight=" + sugarWeight + "]";
	}
	
	

}
