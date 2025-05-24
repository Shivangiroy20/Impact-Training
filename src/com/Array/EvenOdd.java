package com.Array;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[] = {5,6,3,8,9,6,7};
		int EvenCount = 0;
		int OddCount = 0;
		
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] % 2 == 0) {
				EvenCount++;
				
			}else {
				OddCount++;
			}
		}
		System.out.println("The Even number are :: " + EvenCount);
		System.out.println("The Odd number are :: " + OddCount);
	}

}
