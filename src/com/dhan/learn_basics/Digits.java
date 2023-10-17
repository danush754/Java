package com.dhan.learn_basics;


import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter any integer: ");
		String number = input.next();
		for (int i = 0; i< number.length();i++) {
			System.out.println(number.charAt(i));
			
		} 
		input.close();
	}

}
