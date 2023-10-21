package com.dhan.learn_basics;



import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter height of the pyramid: ");
		int height = input.nextInt();
		for (int i = 1; i < height + 1; i++) {
			for(int j = 1; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = height-1 ; i > 0 ;i--) {
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();

	}

}
