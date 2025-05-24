package Stack;
import java.util.*;

public class RemoveoOperation {

	public static void main(String[] args) {
		Stack<String> stackObj = new Stack();
		
		stackObj.push("java");
		stackObj.push("C++");
		stackObj.push("python");
//		remove method
		
	stackObj.remove("java");
		while(!stackObj.isEmpty()) {
			System.out.println(stackObj.pop());
		}
		

	}

}
