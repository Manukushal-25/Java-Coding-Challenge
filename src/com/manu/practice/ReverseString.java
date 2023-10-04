package com.manu.practice;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse an array 
		
		String str = "Tiger";
		char arr[] = str.toCharArray();
		
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(" " +arr[i]);
		}
	}

}
