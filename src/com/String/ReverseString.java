package com.String;

import java.util.*;

public class ReverseString {


		    public static void main(String[] args) {
		        String str = "My name is xyz";

		       
//		        String[] words = str.split(" ");
//
//		   
//		        System.out.print("The reverse string is: ");
//		        for (int i = words.length - 1; i >= 0; i--) {
//		            System.out.print(words[i] + " ");
		            
		            
//		            char[] charArr = str.toCharArray()
//;		            for(int n=0, j=charArr.length-1; n<j;n++,j--) {
//				    	char temp = str.charAt(n);
//				    	charArr[n] = charArr[j];
//				    	charArr[j] = temp;
//		            
//		        }
//                    for(char ele:charArr)
//                   	System.out.print(ele);
		        
		        String reversed = new StringBuilderDemo().reverse().toString();

		        System.out.println("The reversed string is: " + reversed);

		    }
		    
		    
		    }
}
	


