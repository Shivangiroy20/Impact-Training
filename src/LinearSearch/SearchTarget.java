package LinearSearch;

public class SearchTarget {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int target = 40;
		
		int left = 0;
		int right = arr.length -1;
		int mid = 0;
		while(left <= right) {			
			 mid = (left + right)/2;
			 if(arr[mid] == target) {
				 System.out.println("Target is found :: " + mid);
				 break;
			 }
			 
		else if(arr[mid] < target){
			left = mid +1;
		}else  {
			right = mid -1;
		}
		}
	}
}

