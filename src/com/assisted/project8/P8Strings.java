package com.assisted.project8;

public class P8Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String functions");
		
		// String length
		String s1 = new String("String Examples");
		System.out.println(s1.length());
		
		// toLower case
		String s2 = "STRING FUNCTIONS";
		System.out.println(s2 + " String in lower case: " + s2.toLowerCase());
		
		// toUpper case
		String s3 = "string functions";
		System.out.println(s3 + " String in lower case: " + s2.toUpperCase());
		
		// substring
		String s4 = "This is java string program";
		System.out.println("String starting from 5th index: " + s4.substring(5));
		
		// replace
		String s5 = "Java";
		System.out.println("Replacing the character: " + s5.replace('a', 's'));
		
		// comparison
		String s6 = "Java program";
		String s7 = "Python program";
		System.out.println(s6.compareTo(s7));
		
		// StringBuffer
		StringBuffer sbf = new StringBuffer("Java is a ");
		sbf.append("Programming Language");
		System.out.println(sbf);
		
		// StringBuilder
		StringBuilder sbl = new StringBuilder("String Builder");
		sbl.reverse();
		System.out.println(sbl);
		
	}

}
