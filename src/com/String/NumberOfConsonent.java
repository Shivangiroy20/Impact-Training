package com.String;

public class NumberOfConsonent {

	public static void main(String[] args) {
		String str = "my name is Shivangi";
		
		int count = 0;
		 for(int i=0; i<str.length(); i++) {
			 char  ch = str.charAt(i);
			 
			 if((ch >= 'a' && ch <= 'z') &&
			    (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')){
				 count++;

	}
		 }
		 System.out.println("number of consonent::" + count);
		
	}

}



