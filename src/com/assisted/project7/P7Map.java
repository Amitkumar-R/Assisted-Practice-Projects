package com.assisted.project7;

import java.util.HashMap;
import java.util.Map;

public class P7Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("a", new Integer(100));
		map.put("b", new Integer(200));
		map.put("c", new Integer(300));
		map.put("d", new Integer(400));

		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
	}

}
