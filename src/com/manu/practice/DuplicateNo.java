package com.manu.practice;

public class DuplicateNo {

	public static void main(String[] args) {
		//Finding Duplicate numbers in  Array 
		
		int arr[] = {1,2,3,4,1,5,2};
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate value:" +arr[i]);
				}
			}
		}

	}

}
