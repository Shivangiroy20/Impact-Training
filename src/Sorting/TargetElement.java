package Sorting;

import java.util.Arrays;

public class TargetElement {

    public static void main(String[] args) {
        char[] arr = {'a', 'f', 'g', 'r', 'e'};
        char target = 'g';

       
        Arrays.sort(arr);
        System.out.println("The sorted array: " + Arrays.toString(arr));

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("The index of target" + i);
            }
        }
    }
}
