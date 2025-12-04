package com.bpi.helloworld.main;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		//Parsing
		//Operators sample
		System.out.print("Enter Num X: ");
		int x = input.nextInt();
		System.out.print("Enter Num Y: ");
		int y = input.nextInt();
		
		int sum = x + y;
		int dif= x - y;
		int pro = x * y;
		int quo = x / y;
		int rem = x & y;
		
		System.out.println("Sum :        " + sum);
		System.out.println("Difference : " + dif);
		System.out.println("Product :    " + pro);
		//System.out.println("Quotient :   " + quo);
		//System.out.println("Remainder :  " + rem);
	}

}
