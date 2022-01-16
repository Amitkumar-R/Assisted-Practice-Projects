package com.assisted.project10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strPattern = "[a-z]+";
		String str = "Java is a Progrmaming language";
		Pattern pattern = Pattern.compile(strPattern);
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()) {
			System.out.println(str.substring(matcher.start(), matcher.end()));
		}
		
	}

}
