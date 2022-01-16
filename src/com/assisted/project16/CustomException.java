package com.assisted.project16;

class CustException extends Exception {
	public CustException(String str) {
		super(str);
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CustException("Custom Exceptions");
		} catch(CustException ce) {
			System.out.println("Exception found");
			System.out.println(ce.getMessage());
		}
	}

}
