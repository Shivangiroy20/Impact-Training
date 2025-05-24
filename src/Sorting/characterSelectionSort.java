package Sorting;

import java.util.Scanner;

public class characterSelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  
		System.out.print("Enter a string: ");
		 String str = sc.nextLine().trim();
//        String str = sc.nextLine(); 
         
        char[] ch = str.toCharArray();
        
        for(int i=0; i<ch.length; i++) {
        	for(int j= i+1; j<ch.length; j++) {
        		if (ch[i] > ch[j]) {
        		
        		char temp = ch[i];
        		ch[i] = ch[j];
        		ch[j]  = temp;
        	}
        	}
        }
        for (char c : ch) {
            System.out.print(c);
	}
	


	}
}

