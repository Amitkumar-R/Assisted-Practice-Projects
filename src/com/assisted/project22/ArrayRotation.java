package com.assisted.project22;

public class ArrayRotation {
	
	public void rotation(int[] n, int k) {
		if(k > n.length) 
			k = k % n.length;
		int[] result = new int[n.length];
		for(int i = 0; i < k; i++) {
			result[i] = n[n.length - k + i];
		}
		
		int j = 0;
		for(int i = k; i < n.length; i++) {
			result[i] = n[j];
			j++;
		}
		System.arraycopy(result, 0, n, 0, n.length);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotation array = new ArrayRotation();
		int arr[] = {10, 20, 30, 40, 50, 60};
		array.rotation(arr, 5);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
