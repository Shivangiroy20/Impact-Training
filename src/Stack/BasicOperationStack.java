package Stack;

import java.util.Stack;



public class BasicOperationStack {

	public static void main(String[] args) {
		Stack<Integer> stackObj = new Stack<Integer>();
		
//		add 
		stackObj.add(10);
		stackObj.push(20);
		stackObj.addElement(30);
		
//		traverse
//		while(!stackObj.isEmpty()) {
//			System.out.println(stackObj.pop());
//			
//		}
		Integer stackEle = stackObj.peek()
;		System.out.println("StackEle::" +stackEle);
        System.out.println("size of stack::" +stackObj.size());
        
        System.out.println("pop demo::");
        Integer popElement = stackObj.pop();
        System.out.println("StackEle::"+popElement);
        System.out.println("size of stack::"+stackObj.size());
	}

}
