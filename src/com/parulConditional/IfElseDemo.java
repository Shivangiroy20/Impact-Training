package com.parulConditional;

import java.util.*;
public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age::");
		int age = sc.nextInt();		
		if(age >= 18) {
			System.out.println("Person elegible for the voting");
		}else {
			System.out.println("Person is not elegible for the Voting");
		}

	}

}
