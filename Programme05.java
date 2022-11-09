package com.pack;

import java.util.Scanner;

public class Programme05 {

	public static void main(String[] args) {
		//Even or Odd or invalid...
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	if(a>0) {
		if(a%2==0) {
			System.out.println("even..!");
		}
		else {
			System.out.println("odd..!");
		}
		
		
	}
	else {
		System.out.println("invalid..!");
	}
			

	}

}
