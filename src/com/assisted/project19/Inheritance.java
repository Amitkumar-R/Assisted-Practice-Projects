package com.assisted.project19;

class Employee {
	String name = "Virus";
	float salary = 25000;
}

public class Inheritance extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance inherit = new Inheritance();
		System.out.println(inherit.name + "'s salary is " + inherit.salary);
	}

}
