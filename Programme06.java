package com.pack;

import java.util.Scanner;

public class Programme06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub...
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>=1 && a<=100) {
			
			if(a%2!=0) {
				
				System.out.println("weired..");
			}
			
	else  {
		if(a>=2 && a<=5) {
			System.out.println("Not weired");
		}
		else if (a>=6 && a<=20) {
			System.out.println("weired..");
		}
		
		else {
			System.out.println("not weired..");
		}
		}
			
			}
	}
			
			
		}

	


