package Stack;

import java.util.*;

public class ArrayDequeStack {

	public static void main(String[] args) {
		ArrayDeque arrayDequeStackObj = new ArrayDeque();
		arrayDequeStackObj.push("amol");
		arrayDequeStackObj.push("Het");
		arrayDequeStackObj.push("gossip person");
		
		while(!arrayDequeStackObj.isEmpty()) {
			System.out.println(arrayDequeStackObj.pop());
		}
			

	}

}
