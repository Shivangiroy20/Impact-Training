package Stack;
import java.util.*;

public class ReverseTwoStack {

	public static void main(String[] args) {
		Stack<String> Stack1 = new Stack<String>();
		Stack<String> Stack2 = new Stack<String>();
		
		Stack1.push("java");
		Stack2.push("Python");
		
		while(!Stack1.isEmpty()) {
			Stack2.push(Stack1.pop());
		}
		 while (!Stack2.isEmpty()) {
	            Stack1.push(Stack2.pop());
	        }
		 System.out.println("Reversed Stack A: " + Stack1);
    }
		

	}


