package com.String;

public class EquasDemo {

	public static void main(String[] args) {
		String str = new String("abc");
		String str1 ="abc";
		System.out.println(str==str1); // check the locationa as well as value are same or not
		System.out.println(str.equals(str1)); // check whether the values are same or not

	}

}
