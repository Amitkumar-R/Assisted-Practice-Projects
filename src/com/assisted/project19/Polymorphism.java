package com.assisted.project19;

public class Polymorphism {
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int mul(int a, int b, int c) {
		return a * b * c;
	}
	
	public double mul(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism poly = new Polymorphism();
		System.out.println(poly.mul(4, 5));
		System.out.println(poly.mul(4, 5, 2));
		System.out.println(poly.mul(2.5, 3.0));
	}

}
