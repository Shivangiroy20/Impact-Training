package com.String;

public class StringBufferDemo {

	public static void main(String[] args) {
	 
		StringBuffer stringBufferObj = new StringBuffer("My name is pratik");
		stringBufferObj.append("I am working with hitbull");
		stringBufferObj.append("I am working on the java fs");
		
		System.out.println(stringBufferObj);
		System.out.println(stringBufferObj.delete(0, 5));
		System.out.println(stringBufferObj);

		

	}

}
