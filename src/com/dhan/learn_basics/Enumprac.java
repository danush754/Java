package com.dhan.learn_basics;

public class Enumprac {
	public static void main(String[] args) {
		Priority priority = Priority.MEDIUM;
		
		switch (priority) {
		case HIGH: 
			System.out.println("High Priority");
			break;
		case MEDIUM:
			System.out.println("Medium Priority");
			break;
		case LOW:
			System.out.println("Low Priority");
			break;
		}
		Priority[] values = Priority.values();
		for(Priority allPriority : values) {
			System.out.println(allPriority);
		}
	}

}
