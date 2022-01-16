package com.assisted.project5;

// Default constructor
class DefaultConstructor {
	DefaultConstructor () {
		System.out.println("This is Default constructor");
	}
}

// Parameterized constructor
class Student {
	int sid;
	String sname;
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	void display() {
		System.out.println(sid + " " + sname);
	}
	
}

public class P5Constuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Default Constructor
		System.out.println("Default constructor");
		DefaultConstructor dc = new DefaultConstructor();
		
		System.out.println();
		
		// Parameterized constructor
		System.out.println("Parameterized constructor");
		Student s1 = new Student(840, "Virus");
		Student s2 = new Student(420, "Malware");
		s1.display();
		s2.display();
	}

}
