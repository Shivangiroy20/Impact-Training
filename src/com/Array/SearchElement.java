package com.Array;

public class SearchElement {

	public static void main(String[] args) {
		int arr[] = {3,4,5,7,9};
		int num = 7;
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				index = i;
				
			}
		}
		
		System.out.println("The index is :" + index);
		
	}
	

}
