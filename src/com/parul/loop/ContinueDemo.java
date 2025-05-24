package com.parul.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		
		for(int day = 1; day <= 7; day++) {
			if(day == 7)
				continue;
//			System.out.println("Week of day is :: " + day);	
			
			 switch (day) { 
			
		  case 1:
             System.out.println("Week of the day is :: 1 (Monday)");
             break;
             
		  case 2:
			  System.out.println("Week of the day is :: 2(Tuesday)");
			  break;
			  
		  case 3: 
			  System.out.println("Week of the day is :: 3(Wednesday)");
			  break;
			  
		  case 4:
			  System.out.println("Week of the day is :: 4(Thursday)");
			  break;
		  case 5:
			  System.out.println("Week of the day is :: 5(Friday)");
			  break;
		  case 6:
			  System.out.println("Week of the day is :: 6(Saturday)");
			  break;
			  
		  default:
			  System.out.println("Holiday :: Sunday");
			  break;
			  
			  
			 

			  

			
		}
	}

}
}
