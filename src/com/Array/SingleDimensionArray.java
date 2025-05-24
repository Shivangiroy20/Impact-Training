package com.Array;

public class SingleDimensionArray {

	public static void main(String[] args) {
//		new keyword
		int[] arr= new int[5];
		
		
		for(int i=0; i<arr.length; i++)
			arr[i] = 10;
		
		for(int i=0; i<arr.length;i++)
			System.out.println("Value ::" + arr[i]);
		
//		initialization
		
		int[] initializationArr = {10,20,30};
		
		for(int i=0; i<initializationArr.length; i++)
			System.out.println("Initialization arr ::" + initializationArr[i]);
	}
	
	

}
