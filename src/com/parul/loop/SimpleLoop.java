package com.parul.loop;

public class SimpleLoop {

	public static void main(String[] args) {
		// traditional for loop
//		for(int a = 0; a<20; a++) {
//			System.out.println("a value is :: " + a);
//		}
//		
//		nested for loop
		
		for(int parentvar = 0; parentvar <=5; parentvar++ ) 
			for(int childVar = 1; childVar <=2; childVar++) 
				System.out.println("Parent :: " + parentvar  +  "childVar :: " + childVar );
			
		
		
		
		

	}

}
