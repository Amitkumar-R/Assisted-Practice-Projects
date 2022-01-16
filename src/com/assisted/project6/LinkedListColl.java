package com.assisted.project6;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Lined list collections");
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Krishna");
		linkedList.add("Ram");
		linkedList.add("Arjuna");
		linkedList.add("Bharath");
		
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
