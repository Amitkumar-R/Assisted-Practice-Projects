package com.assisted.project36;

public class BubbleSort {

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int t = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(arr[j-1] > arr[j]) {
					t = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {30, 99, 17, 23, 1, 10, 4, 78, 59};
		System.out.println("Array list before bubble sort...");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array list after bubble sort...");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
