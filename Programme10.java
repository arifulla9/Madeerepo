package com.pack;

import java.util.Scanner;

public class Programme10 {

	public static void main(String[] args) {
		// number having even and odd degits
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		int even = 0;
		int odd = 0;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
			num=num/10;
		}
		System.out.println("number of even degits:"+even);
		System.out.println("number of odd degits:"+odd);

	}

}
