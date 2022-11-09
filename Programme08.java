package com.pack;

import java.util.Scanner;

public class Programme08 {

	public static void main(String[] args) {
		// E-commerce Book shef
		
		Scanner s=new Scanner(System.in);
		int sale=s.nextInt();
		if(sale>=30 && sale<=100) {
			if(sale>=30 && sale<=50) {
			System.out.println("D");
			}
			else if (sale>=51 && sale<=60) {
				System.out.println("C");
			}
			else if (sale>=61 && sale<=80) {
				System.out.println("B");
			}
			else  {
				System.out.println("A");
			}
			
			
		}
else {
	System.out.println("invalid..!");
}
	}

}
