package com.manu.practice;

public class MinMaxNo {

	public static void main(String[] args) {
		// Finding largest and Smallest number in array

		int a[] = { 21, 2, 13, 4, 25 };
		int min, max;
		min = max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Smallest Number: " + min);
		System.out.println("Largest Number: " + max);

	}
}
