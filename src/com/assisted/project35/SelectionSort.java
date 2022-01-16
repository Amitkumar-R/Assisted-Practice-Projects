package com.assisted.project35;

public class SelectionSort {

	public static void selectionSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[index]) {
					index = j;
				}
			}
			int smallNumber = array[index];
			array[index] = array[i];
			array[i] = smallNumber;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {19, 2, 10, 41, 33, 20, 22, 87, 9};
		System.out.println("Before selection sort...");
		for(int i : array1) {
			System.out.print(i + " ");
		}
		System.out.println();
		selectionSort(array1);
		System.out.println("After selection sort...");
		for(int i: array1) {
			System.out.print(i + " ");
		}

	}

}
