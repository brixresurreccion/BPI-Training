package com.bpi.helloworld.main;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Typecasting Activity
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter Age: ");
		int num1 = input.nextInt();
		double num2 = (double) num1;
		System.out.println(num2);
		System.out.println("Age as int:     " + num1);		
		System.out.println("Age as double:  " + num2);
	}

}
