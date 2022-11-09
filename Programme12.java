package com.pack;

import java.util.Scanner;

public class Programme12 {

	public static void main(String[] args) {
		// Largest variable
		Scanner s= new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a=s.nextInt();
		System.out.println("Enter Second Number : ");
		int b=s.nextInt();
		System.out.println("Enter Third Number : ");
		int c=s.nextInt();
		/*if(a>b && a>c) {
			System.out.println(a+" Largest Number");
		}
		if(b>a && b>c) {
			System.out.println(b+" Largest Number");
		}
		if(c>a && c>b) {
			System.out.println(c+" Largest Number");
		}*/
		
		int Largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(Largest+" Largest Number");

	}

}
