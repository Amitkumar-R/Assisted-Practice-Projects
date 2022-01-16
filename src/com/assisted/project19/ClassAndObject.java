package com.assisted.project19;

class Student {
	int sid;
	String sname;
}

public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.sid = 420;
		student.sname = "Virus";
		System.out.println(student.sid + " student id is belongs to " + student.sname);
	}

}
