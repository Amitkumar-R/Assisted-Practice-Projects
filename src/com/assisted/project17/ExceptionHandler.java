package com.assisted.project17;

class Parent {
	void msg() {
		System.out.println("This is parent method");
	}
}

class Child extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("This is child method");
	}
}

public class ExceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		try {
			p.msg();

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}
