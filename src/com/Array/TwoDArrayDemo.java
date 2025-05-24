package com.Array;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
//		Insertion of value in Array
       for(int i=0 ;i<2;i++) {
    	   for(int j=0;j<3;j++) {
    		  arr[i][j] = 20;
    	   }
    	  
       }
//      to print the value store in the array 
       for(int i=0 ;i<2;i++) {
    	   for(int j=0;j<3;j++) {
    		  System.out.print(i+" " +j+ " " +arr[i][j] + "New Element");
       
	}
    	   System.out.println();
       }
       
//       initialization
       int[][] initializationArr = {{10,20,30},{40,50,60}};// creation of array
       
//       to print the value present in the initialization array
       System.out.println("Initialization");
       for(int i=0 ;i<2;i++) {
    	   for(int j=0;j<3;j++) {
    		  arr[i][j] = 20;
    		  System.out.println(i+ " "+j+ " "+ initializationArr[i][j]+"new element");
    	   }
    	  
       }
       
       

}
}
