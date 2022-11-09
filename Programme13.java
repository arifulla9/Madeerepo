package com.pack;

public class Programme13 {

	public static void main(String[] args) {
		// Fibonacci Number
		
		
		/*int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.println(n1+""+n2);
		for(int i=2; i<10; i++) {
			
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			
		}*/
		int number=10;
		int f1=0,f2=1,f3=0;
		for(int i=1; i<=number; i++)
		{
		f3=f1+f2;
		f1=f2;
		f2=f3;
		//f3=f1;
		System.out.print(" "+f3);
		}

	}

}
