package com.Array;

public class StartedEvenNumber {

	public static void main(String[] args) {
		int arr[] = {99,1,24,65,12457,88,97,1456};
		
int firstdigit = 0;
int getfirstDigit = 0;
		
		 for (int num : arr) {
	            int firstDigit = getfirstDigit(num);
		 

			
			 if (firstdigit % 2 == 0) {
	                System.out.println(num);
	                
	                
	            
			 }
		 }
		
	}

	private static int getfirstDigit(int num) {
		while (num >= 10) {
            num /= 10;
        }
        
		
		return num;
	}

}
