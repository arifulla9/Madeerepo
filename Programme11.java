package com.pack;

import java.util.Scanner;

public class Programme11 {

	public static void main(String[] args) {
		// sum of digits in given number
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
System.out.println("sum of all degits : "+sum);
		
	}

}
