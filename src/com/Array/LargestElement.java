package com.Array;

public class LargestElement {

	public static void main(String[] args) {
		int arr[] = { 12, 14, 15, 16};
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	

}
