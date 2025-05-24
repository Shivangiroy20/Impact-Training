package LinearSearch;

public class SearchingVowel {

	public static void main(String[] args) {
		char[]  ch = {'m', 'y','z','a','d','k'};
		int count =0;
		
		for(int i=0; i<ch.length; i++) {			
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
				System.out.println("the index is "+ i);
			}
		}
		System.out.println("total found  ::" + count);

	}

}
