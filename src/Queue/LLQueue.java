package Queue;
import java.util.*;


public class LLQueue {

	public static void main(String[] args) {
		Queue<String> stringQue = new LinkedList<String>();
		
		stringQue.offer("java");
		stringQue.offer("data");
		stringQue.offer("ruby");
		stringQue.offer("Python");
		
//		remove 
		
		stringQue.poll();
		
//		 traverse the code using the iterator 
		
		Iterator<String> it = stringQue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
		
		System.out.println(stringQue);

	}

}
