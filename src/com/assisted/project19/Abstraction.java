package com.assisted.project19;

abstract class ParentClass {
	abstract public void disp1();
	public void disp2() {
		System.out.println("This is parent class");
	}
}

class ChildClass extends ParentClass {

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("Overriding the abstract method of parent class in child class");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass childObj = new ChildClass();
		childObj.disp1();
		childObj.disp2();
	}

}
