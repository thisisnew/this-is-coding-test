package Ch06;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {5, 7, 3, 2, 4, 1, 6, 8, 10, 9};
		int n = arr.length;
		
		sort(arr, 0, n-1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int pivot = start;
		int left = start + 1;
		int right = end;
		
		while(left <= right) {
			while(left <= end && arr[left] <= arr[pivot]) {
				left++;
			}
			
			while(right > start && arr[right] >= arr[pivot]) {
				right--;
			}
			
			if(left > right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		sort(arr, start, right-1);
		sort(arr, right+1, end);
	}
	
}
