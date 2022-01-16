package com.assisted.project16;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 34, b = 0, result = 0;
		try {
			result = a / b;
		} catch(ArithmeticException ae) {
			System.out.println("Error: " + ae.getMessage());
		} finally {
			System.out.println("The result is: " + result);
		}

	}

}
