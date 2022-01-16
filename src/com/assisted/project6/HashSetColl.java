package com.assisted.project6;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hash set collection");
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Kunti");
		hashSet.add("Droupadi");
		hashSet.add("Gandhari");
		hashSet.add("Agni");
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
