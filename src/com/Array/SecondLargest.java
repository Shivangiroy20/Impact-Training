package com.Array;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {18, 12, 14, 15, 16,7,17,19};
		int max = 0;
		int secondMax = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= max) {
			  secondMax = max;
			  max = arr[i];
			
			}else if(arr[i] != max) {
				secondMax = arr[i];
			}
				
			
						
			}
		System.out.println("SecondLargest" + secondMax);
		
		}
	
	}

	


