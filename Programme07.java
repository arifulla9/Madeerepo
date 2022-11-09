package com.pack;

import java.util.Scanner;

public class Programme07 {

	public static void main(String[] args) {
		// Leap
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		if(year%4==0 && year%100!=0 || year%100==0) {
			
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not leap year");
		}

	}

}
