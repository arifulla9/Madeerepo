package com.pack;

import java.util.Scanner;

public class Programme09 {

	public static void main(String[] args) {
		// degit count
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count = 0;
		while(num>0) {
			num=num/10;
			
			count++;
		}
		System.out.println("Number of degits"+count);
	}

}
