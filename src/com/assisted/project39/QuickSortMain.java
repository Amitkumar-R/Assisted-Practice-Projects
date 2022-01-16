package com.assisted.project39;

import java.util.Arrays;

class QuickSort {
	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for(int j = low; j < high ; j++) {
			if(arr[j] <= pivot) {
				i++;
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		
		int t = arr[i + 1];
		arr[i+1] = arr[high];
		arr[high] = t;
		
		return (i + 1);
	}
	
	static void quicksort(int arr[], int low, int high) {
		if(low < high) {
			int p = partition(arr, low, high);
			quicksort(arr, low, p - 1);
			quicksort(arr, p + 1, high);
		}
	}
}

public class QuickSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] elements = {9, 2, 1, 5, 8, 3, 7, 4};
		System.out.println("Array list before quick sort...");
		System.out.println(Arrays.toString(elements));
		int size = elements.length;
		QuickSort.quicksort(elements, 0, size - 1);
		System.out.println("Array list after quick sort...");
		System.out.println(Arrays.toString(elements));

	}

}
