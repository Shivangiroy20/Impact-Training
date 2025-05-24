package com.String;

public class StringMethods {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str1= "  xyz  ";
		System.out.println(str1.trim());
		
		String str2 = "split Demo";
		String[] splitArr = str2.split(" ");
		System.out.println(splitArr[0]);
		
		char charAtOfIndex = str2.charAt(0);
		System.out.println(charAtOfIndex);
		
		System.out.println("length is::"+str2.length());
		System.out.println(str2.toCharArray()[0]);

		
	}

}
