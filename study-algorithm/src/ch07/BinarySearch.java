package ch07;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int target = 4;
		int result = -1;
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if(arr[mid] == target) {
				result = mid;
				break;
			} else if(arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		System.out.println(result + 1);
	}
}
