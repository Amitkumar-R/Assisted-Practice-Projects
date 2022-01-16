package com.assisted.project16;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 4, b = 0, result;
		
		try {
			if(b == 0) 
				throw(new ArithmeticException("Can't divide by zero"));
			else {
				result = a / b;
				System.out.println("The result is: " + result);
			}
		} catch(ArithmeticException ae) {
			System.out.println("Error: " + ae.getMessage());
		}
		System.out.println("End of the Program");
		
	}

}
