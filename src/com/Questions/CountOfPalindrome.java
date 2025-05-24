package com.Questions;

public class CountOfPalindrome {

	public static void main(String[] args) {
		
		
	for(int num = 1; num <= 1000; num++) {
		int temp = num;
		int rev = 0;
		int sum =0;
		
		
		
		
		
		 while(temp > 0) {
			 rev = rev * 10 + temp % 10;
			 temp /= 10;
			  
		
		
	}
         if (num == rev)
        	 sum = sum+1;
             System.out.println(num + " ");
         System.out.println("The count is "+ sum);
         

		
	
	
		
	}
		
		
		}
	}

	


