package com.dhan.presents;

import java.util.Arrays;

public class Present {
	
//	initialized required variables and arrays 
	private static final int DEFAULT_GIFT_CAPACITY = 10;
	private Sweet[] sweets = new Sweet[DEFAULT_GIFT_CAPACITY];
	private int lastIndexAdded;
	

//	This method adds the new sweets to the sweets array
    public void addSweet(Sweet sweet) {
    	if(sweet == null) {
    		return;
    	}
    	if (sweets.length <= lastIndexAdded) {
    		sweets = Arrays.copyOf(sweets, sweets.length*2);
    	}
		
    	sweets[lastIndexAdded++] = sweet;
		
	}
    
//    This method calculates the total weight of the sweets 
public double calculateTotalWeight() {
		double totalWeight = 0;
		for(Sweet sweet : sweets) {
			if(sweet != null) {
				totalWeight += sweet.getWeight();
			}
		}
		return totalWeight;
	}
	

// this method returns the sweets that are coming inside the sugar range given by the user
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		int matchSweetsAmount = 0;
		for(Sweet sweet : sweets) {
			if(sweet != null && (sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight)) {
				matchSweetsAmount++;
			}
		}
		
		int index = 0;
		Sweet[] filteredSweets = new Sweet[matchSweetsAmount];
		for(Sweet sweet : sweets) {
			if(sweet != null && (sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight)) {
				filteredSweets[index++] = sweet;
			}
		}
		
		
		return filteredSweets;
	}

// This method gets only the sweets which are not null
	public Sweet[] getSweets() {
		
		int notNullSweets = 0;
		for(Sweet sweet : sweets) {
			if(sweet != null) {
				notNullSweets += 1;
			}
		}
		
		Sweet[] newSweets = new Sweet[notNullSweets];
		int index = 0;
		for(Sweet sweet :sweets) {
			if(sweet != null) {
				newSweets[index++] = sweet;
			}
		}
		return newSweets;
	}

	@Override
	public String toString() {
		return "Present sweets =" + Arrays.toString(sweets) + "]";
	}


	
}


