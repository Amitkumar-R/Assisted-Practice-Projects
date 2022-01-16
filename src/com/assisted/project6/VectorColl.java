package com.assisted.project6;

import java.util.Iterator;
import java.util.Vector;

public class VectorColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Vector collection");
		Vector<String> vector = new Vector<String>();
		vector.add("Shakuni");
		vector.add("Bheema");
		vector.add("Duryodana");
		vector.add("Bhishma");
		
		Iterator<String> iterator = vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
