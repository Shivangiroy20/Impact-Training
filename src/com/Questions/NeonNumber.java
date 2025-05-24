package com.Questions;

public class NeonNumber {

	public static void main(String[] args) {
		int n = 9;
		int square = n * n;
		int sum = 0;
		while(square> 0) {
			sum += square % 10;
			square /= 10;
			
		}if(sum == n) {
			System.out.println(n + " is a neon number");
			
		}else {
			System.out.println(n + " is not a neon number");
		}

	}

}
