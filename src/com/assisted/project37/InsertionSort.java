package com.assisted.project37;

public class InsertionSort {
	
	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for(int j = 1; j < n; j++) {
			int k = arr[j];
			int i = j - 1;
			while((i > -1) && (arr[i] > k)) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = k;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3, 12, 9, 80, 12, 65, 32, 25};
		System.out.println("Array list before insertion sort...");
		for(int i : arr1) {
			System.out.print(i + " ");
		} 
		System.out.println();
		insertionSort(arr1);
		System.out.println("Array list after insertion sort...");
		for(int i : arr1) {
			System.out.print(i + " ");
		}

	}

}
