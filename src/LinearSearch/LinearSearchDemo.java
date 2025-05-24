package LinearSearch;

public class LinearSearchDemo {

	public static void  main(String[] args) {
		int arr[]  = {1,15,16,70,2};
		int target = 100;
		
		boolean isFound=false;
	for(int i=0; i<arr.length;i++) {
		if(arr[i] == target) {
			isFound = true;
			System.out.println("the index is ::" + i);
			break;
		}
	}
	if(!isFound) {
		System.out.println("Target is not found");
	}
		

	}

}
