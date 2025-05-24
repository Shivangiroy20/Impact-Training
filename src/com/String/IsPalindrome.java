package com.String;

public class IsPalindrome {

	public static void main(String[] args) {
		String s = "madam";
		 String reversed = new StringBuilderDemo().reverse().toString();
		
		 if (s.equals(reversed)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }
		 
	 }
	}


