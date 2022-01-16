package com.assisted.project33;

public class BinarySearch {
	
	public static void binarySearch(int[] arr, int low, int high, int key) {
		int mid = (low + high) / 2;
		while(low <= high) {
			if(arr[mid] < key) {
				low = mid + 1;
			} else if(arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		
		if(low > high) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1, 2, 5, 6, 7, 8};
		int key = 6;
		int high = array.length - 1;
		binarySearch(array, 0, high, key);

	}

}
