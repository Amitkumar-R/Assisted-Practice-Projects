package com.assisted.project4;

// int return type
class IntReturn {
	public int add() {
		int num1 = 10, num2 = 20, result;
		result = num1 + num2;
		return result;
	}
}

// double return type
class DoubleReturn {
	public double div() {
		double num1 = 20, num2 = 5, result;
		result = num1 / num2;
		return result;
	}
}

// void return type
class VoidReturn {
	public void display() {
		System.out.println("This is void return type");
	}
}

// float return type
class FloatReturn {
	public float mul() {
		float num1 = 4, num2 = 3, result;
		result = num1 * num2;
		return result;
	}
}

public class P4ReturnTypes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int return type
		IntReturn ir = new IntReturn();
		System.out.println("Int return type\nThe sum of two numbers: " + ir.add());
		
		System.out.println();
		
		// double return type
		DoubleReturn dr = new DoubleReturn();
		System.out.println("Double return type\nThe divison of two numbers: " + dr.div());
		
		System.out.println();
		
		// void return type
		VoidReturn vr = new VoidReturn();
		vr.display();
		
		System.out.println();
		
		// float return type
		FloatReturn fr = new FloatReturn();
		System.out.println("Float return type\nThe multiplication of two number: " + fr.mul());
	}

}
