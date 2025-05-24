package com.Questions;
import java.util.*;
public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean  Member = sc.nextBoolean();
		int cart = sc.nextInt();
		
			
		 if(Member == true && cart > 5000) {
			 System.out.println("Discount is ::" + cart * 0.2); // find   discount of  20%
		 }else if(Member == true  && cart <= 5000) {
			 System.out.println("Discount is :: " + cart * 0.1); // discount of 10%
		
		 }else {
			 System.out.println("Not a Member" + cart * 0.05); // find discount of 5%
		 }
		 
		 
	}

}
