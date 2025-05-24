package Stack;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> bookDetails = new Stack<String>();
		bookDetails.push("java");
		bookDetails.push("C++");
		bookDetails.push("Python");
	
//		traverse the stack
		
		while(!bookDetails.isEmpty()) {
			System.out.println(bookDetails.pop());
		}

	}
	
	

}
