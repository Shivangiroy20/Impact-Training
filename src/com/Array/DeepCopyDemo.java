package com.Array;

public class DeepCopyDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] copyArr = new int[arr.length];
//		deep copy
		for(int i=0; i<arr.length;i++) {
			copyArr[i] = arr[i];
		}
		for(int ele:copyArr) {
			System.out.println(ele);
		}

	}

}
