package com.Array;

public class ShallowCopyDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		int[] copyArr = arr; //shallow copy
		
		//traversing each ele from arr
		for(int ele:copyArr)
			System.out.println("element is:" +ele);
		
		//tradtitional for loop
		for(int i=0; i<copyArr.length;i++)
			System.out.println("traditionalLoop ele ::" +copyArr[i]);
			
			

	}

}
