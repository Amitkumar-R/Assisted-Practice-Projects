package com.assisted.project6;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Tree set collection");
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Laxman");
		treeSet.add("Dasharatha");
		treeSet.add("Indra");
		
		Iterator<String> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
