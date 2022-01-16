package com.assisted.project32;

public class LinearSearch {
	
	public static int linearSearch(int[] array, int k) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {10, 20, 30, 40, 50, 90};
		int k = 20;
		System.out.println(k + " is found at index: " + linearSearch(array1, k));
	}

}
