package Sorting;

import java.util.Arrays;

public class SortCharacter {
		    public static void main(String[] args) {
		        String name = "bharat";
		        char[] arr = name.toCharArray();  		       
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr.length-1; j++) {
		                if (arr[j] > arr[j + 1]) {	                    
		                    char temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }
		       
		        for (char s : arr) {
		            System.out.print(s);
		        }
		    }
		}


