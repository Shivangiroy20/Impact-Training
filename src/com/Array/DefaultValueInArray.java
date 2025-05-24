package com.Array;
public class DefaultValueInArray {

	public static void main(String[] args) {

         int[] arr=new int[5];
         for(int i=0;i<=3;i++)
        	 arr[i]=10;
         System.out.println("int default::"+arr[4]);
        
         
         char[] charArr=new char[5];
         for(int i=0;i<=charArr.length-2;i++)
        	 charArr[i]='A';
         System.out.println("char default::"+charArr[4]);
         }

}