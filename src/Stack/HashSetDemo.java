package Stack;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hashSetObj = new HashSet<String>();
		hashSetObj.add("abc");
		hashSetObj.add("abc");
		hashSetObj.add("xyz");
		
		System.out.println(hashSetObj);


	}

}
