package Stack;

import java.util.Stack;

public class reverseString {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		 String input = "Shivangi";
		 
		 
		 for(int i=0; i<input.length(); i++) {
			 stack.push(input.charAt(i));
		 }
//		 String reversed = "";
		 StringBuilder reverseStr = new StringBuilder();
		 
		 while(!stack.isEmpty()) {
				reverseStr.append (stack.pop());
			}
		 System.out.println("Reversed: " + reverseStr);

	}

}
