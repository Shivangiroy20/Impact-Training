package com.Questions;

public class TotalPagesJaggArray {

	public static void main(String[] args) {
		int[][] jaggArrayObj = new int[4][];
		jaggArrayObj[0]=  new int[2];
		jaggArrayObj[1] = new int[3];
		jaggArrayObj[2]= new int[4];
		jaggArrayObj[3]= new int[4];
		
		
//		1st row
		jaggArrayObj[0][0]= 10;
		jaggArrayObj[0][1]= 8;
		
		
//		2nd row
		jaggArrayObj[1][0]= 8;		
		jaggArrayObj[1][1]= 4;
		jaggArrayObj[1][2]= 9;
		
		
//		3rd row
		jaggArrayObj[2][0]= 2;
		jaggArrayObj[2][1]= 3;
		jaggArrayObj[2][2]= 9;
		jaggArrayObj[2][3]= 8;
		
//		4th row
		jaggArrayObj[3][0]= 10;
		jaggArrayObj[3][1]= 12;
		jaggArrayObj[3][2]= 6;
		jaggArrayObj[3][3]= 8;
		
		
		int sum =0;
		
			
		
		for(int i=0;i<jaggArrayObj.length;i++) {
			for(int j=0;j<jaggArrayObj[i].length;j++) {
				System.out.print(jaggArrayObj[i][j]);
				 sum += jaggArrayObj[i][j];
			}
			System.out.println();
		}
        System.out.println("Total no. of pages: " + sum);

		

	}

}
