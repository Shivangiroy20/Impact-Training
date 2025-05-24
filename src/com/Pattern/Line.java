package com.Pattern;

public class Line {

	public static void main(String[] args) {
		int n = 3;
		int space = 0;
		for(int i=0; i<n;i++) {
			for(int j=0; j<space; j++) {
				
					System.out.print(" ");
				}
			System.out.println("*");
			space += 3;
		}

	}

}
