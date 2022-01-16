package com.assisted.project16;

public class Throws {

	void div() throws ArithmeticException {
		int a = 69, b = 0, result;
		result = a / b;
		System.out.println("The result is: " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws t = new Throws();
		try {
			t.div();
		} catch(ArithmeticException ae) {
			System.out.println("Error: " + ae.getMessage());
		}
		System.out.println("End of the program");
	}

}
