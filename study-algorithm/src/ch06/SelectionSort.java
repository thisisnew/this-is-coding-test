package ch06;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int n = 10;
		int[] arr = {5, 7, 3, 2, 4, 1, 6, 8, 10, 9};
		
		for(int i = 0; i < 10; i++) {
			int minIndex = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
