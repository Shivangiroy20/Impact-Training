package com.Array;

public class AvgOfElement {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5};
		int sum = 0;
		int avg = 0;
			
		for(int num : arr) {
			 sum+= num;
			
			 avg = sum / arr.length;
		}
		System.out.println("The sum of arr:: " + sum);
		System.out.println("The avg of elements:: " + avg);
		

	}

}
