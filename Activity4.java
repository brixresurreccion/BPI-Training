package com.bpi.helloworld.main;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		//If Statement
		System.out.print("Enter Age: ");
		int age = input.nextInt();
		
		
		if (age < 18) {
			System.out.print("Minor");
		} else if (age >= 18 & age <=59) {
			System.out.print("Adult");
		} else {
			System.out.print("Senior");
			
		}
	}

}
