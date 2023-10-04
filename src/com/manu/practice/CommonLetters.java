package com.manu.practice;

import java.util.Scanner;

public class CommonLetters {

	public static void main(String[] args) {
		//Finding Common letters in 2 Strings

		//Predefined input Tiger, Rider
		String s1 = "Tiger";
		char a[] = s1.toCharArray();
		
		String s2 = "Rider";
		char b[] = s2.toCharArray();
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println("Common values: " +a[i]);
				}
			}
			
		}
		
		//Taking Input from Users
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String input1 = input.next();
		char a1[] = input1.toCharArray();
		
		System.out.println("Enter String: ");
		String input2 = input.next();
		char a2[] = input2.toCharArray();
		
		for(int i = 0; i<a1.length; i++) {
			for(int j = 0; j<a2.length; j++) {
				if(a1[i] == a2[j]) {
					System.out.println("Common letters: "+a1[i]);
				}
			}
		}
	}

}
