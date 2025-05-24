package LinearSearch;

public class InDecimal {

	public static void main(String[] args) {
		double[]  arr = {11.0,12.5,12.8,13,13.1};
		int target = 13;
		
		int left =0;
		int right =arr.length -1;
		while(left <= right) {
			int mid =( left+ right )/ 2;
			
			if(arr[mid] == target) {
				System.out.println("Index of target is ::"+ mid);
				break;
			}else if(arr[mid] < target) {
				left = mid + 1;
			}else {
				right = mid -1;
			}
			
		}
	}

}
