package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,4,9,8};
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] < arr[j] ) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int ele : arr)
		System.out.print(ele);
	}

}
