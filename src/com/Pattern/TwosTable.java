package com.Pattern;

public class TwosTable {

	public static void main(String[] args) {
		int n = 3;
		int table  = 2;
		int number = table;
		for(int i=1; i<= n;i++) {
			for(int j=1; j<=i; j++) {
				
					System.out.print(number + " ");
					number += table;
				}
			System.out.println();
		}
		
		

	}

}	