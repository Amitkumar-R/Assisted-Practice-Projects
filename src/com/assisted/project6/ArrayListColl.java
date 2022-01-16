package com.assisted.project6;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Array list collections");
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Virus");
		arrayList.add("Malware");
		arrayList.add("Trozan");
		
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
