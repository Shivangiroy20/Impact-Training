package com.Array;

public class Ascending_Desending {

	public static void main(String[] args) {
		int arr[] = { 4,2,9,5,8,2};
		for(int i=0; i<arr.length; i++) {
		   for(int j = i + 1; j < arr.length; j++) {
            if(arr[i] > arr[j]) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
		}
		   System.out.print("Ascending Order: ");
	        for(int num : arr) {
	            System.out.print(num + " ");
	}
	}

	}



