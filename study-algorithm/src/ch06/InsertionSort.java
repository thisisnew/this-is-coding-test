package ch06;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {5, 7, 3, 2, 4, 1, 6, 8, 10, 9};
		int n = arr.length; //10 
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				} else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
