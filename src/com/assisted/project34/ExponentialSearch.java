package com.assisted.project34;

import java.util.Arrays;

public class ExponentialSearch {
	
	static int expoSearch(int array[], int n, int x) {
		if(array[0] == x)
			return 0;
		int i = 1;
		while(i < n && array[i] <= x )
			i = i * 2;
		return Arrays.binarySearch(array, i/2, Math.min(i, n-1), x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 4, 6, 8, 10, 20, 21};
		int x = 20;
		int res = expoSearch(arr, arr.length, x);
		System.out.println((res < 0) ? 
				"Element is not present in array" : 
				"Element is present at the index: " + res);

	}

}
