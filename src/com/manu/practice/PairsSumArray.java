package com.manu.practice;

public class PairsSumArray {

	public static void main(String[] args) {
		// Find all pairs of element in array whose sum equal to given number 
		// number = 20
		
		int arr[] = {10, 12, 8, 15, 5, 13, 7 };
		int number = 20;
		if(arr.length<2) {
			System.out.println("Array should contain at least 2 no");
		} else {
			for(int i = 0; i<arr.length; i++) {
				for(int j = i+1; j<arr.length; j++) {
					int temp = arr[i]+arr[j];
					if(temp == number) {
						System.out.println("Pairs of 2 no in array " +arr[i]+ " + " +arr[j]+ " equals to " +number);
					}
				}
			}
		}

	}

}
