package com.dhan.learn_basics;

import java.util.Arrays;
import java.util.Scanner;

/* Program starts and asks user to input integer numbers separated by space.

Program creates array object with entered numbers.

Program calls specific method which takes int[] as an parameter and returns max value in this array.*/ 


public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String inputVal = sc.nextLine(); 
		int[] intArray = new int[5];
		int maxInt= 0;
				
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	
//	public static int findMaxIntInArray(int[] intArray) {
//		
//	}
	}



