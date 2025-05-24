package com.Array;

public class SmallestElement {

	public static void main(String[] args) {
		int arr[] = { 12, 14, 15, 16};
		int min = arr[0]; // assume 1st element is smallest
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}

}
