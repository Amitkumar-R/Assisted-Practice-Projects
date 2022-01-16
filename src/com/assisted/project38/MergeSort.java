package com.assisted.project38;

public class MergeSort {
	
	void merge(int arr[], int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		int L[] = new int[n1];
		int H[] = new int[n2];
		
		for(int i = 0; i < n1; ++i)
			L[i] = arr[low + i];
		for(int j = 0; j < n2; ++j)
			H[j] = arr[mid + 1 + j];
		
		int i = 0, j = 0;
		int k = low;
		
		while(i < n1 && j < n2) {
			if(L[i] <= H[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = H[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = H[j];
			j++;
			k++;
		}
	}
	
	void sort(int arr[], int low, int high) {
		if(low < high) {
			int mid = low + (high - low) / 2;
			
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}
	
	static void displayArr(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25, 12, 54, 23, 76, 90};
		System.out.println("Entered the array");
		displayArr(arr);
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, arr.length - 1);
		System.out.println("Sorted array");
		displayArr(arr);
	}

}
