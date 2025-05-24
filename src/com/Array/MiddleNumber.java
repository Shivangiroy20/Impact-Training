package com.Array;

public class MiddleNumber {

	public static void main(String[] args) {
		int arr[] = {99,124,65,12457,88,97,1456};
		for (int num : arr) {
            String str = Integer.toString(num);
            int mid = str.length() / 2;
            char middleDigit = str.charAt(mid);
            System.out.println("Middle digit of " + num + " is: " + middleDigit);
        }
    }
}