package com.assisted.project19;

class Student1 {
	String sname;
	int sid;
	int age;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stud = new Student1();
		stud.setSname("Virus");
		stud.setSid(123);
		stud.setAge(23);
		System.out.println(stud.getSname() + " " + stud.getSid() + " " + stud.getAge());
	}

}
