package com.assisted.project3;

import java.util.Scanner;

public class P3ArithmeticCalculator {
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double sub(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double mul(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double div(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double rem(double num1, double num2) {
		return num1 % num2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1, num2, sum;
		char choice;
		boolean next = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(next) {
			System.out.println("Enter the two numbers: ");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			
			System.out.println("Which operation do you want to perform? : "
					+ "The options are \n" 
					+ "1. Addition \n"
					+ "2. Subtraction \n"
					+ "3. Multiplication \n"
					+ "4. Division \n"
					+ "5. Remainder \n"
					+ "6. Exit \n");
			
			System.out.println("Choose the option: ");
			choice = sc.next().charAt(0);
			
			switch(choice) {
			case '1':
				sum = add(num1, num2);
				System.out.println(num1 + " + " + num2 + " = " + sum);
				break;
				
			case '2':
				sum = sub(num1, num2);
				System.out.println(num1 + " - " + num2 + " = " + sum);
				break;
				
			case '3':
				sum = mul(num1, num2);
				System.out.println(num1 + " * " + num2 + " = " + sum);
				break;
				
			case '4':
				sum = div(num1, num2);
				System.out.println(num1 + " / " + num2 + " = " + sum);
				break;
				
			case '5':
				sum = rem(num1, num2);
				System.out.println(num1 + " % " + num2 + " = " + sum);
				break;
				
			case '6':
				System.exit(0);
				
			default:
				System.out.println("Invalid option");
				
			}
			
			System.out.println("\n Do you want to continue? Y/N");
			choice = sc.next().charAt(0);
			
			if(Character.toUpperCase(choice) != 'Y')
				next = false;
			System.out.println();
		}
		
		System.out.println("Thank you...");
		sc.close();
		
	}

}
