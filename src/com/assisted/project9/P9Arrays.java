package com.assisted.project9;

import java.util.Scanner;

public class P9Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Single dimensional array
		System.out.println("Single dimensional array");
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = sc.nextInt();
		int a[] = new int[10];
		System.out.println("Enter the elements of an array: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		
		// Multi-dimensional array
		int row, col, i, j;
		int array[][] = new int[10][10];
		System.out.println("Enter the row of an array: ");
		row = sc.nextInt();
		System.out.println("Enter the column of an array: ");
		col = sc.nextInt();
		
		// Enter the array elements
		System.out.println("Enter " + row * col + " Array elements ");
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		// 2D array
		System.out.println("The array is: \n");
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
