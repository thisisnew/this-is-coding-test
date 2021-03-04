package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		
		for(int i=0; i<array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		//선택정렬
//		for(int i=0; i<array.length-1; i++) {
//			for(int j=i+1; j<array.length; j++) {
//				if(array[i] > array[j]) {
//					int temp = array[j];
//					array[j] = array[i];
//					array[i] = temp;
//				}
//			}
//		}
		
		//Arrays.sort
//		Arrays.sort(array);
		
		//퀵 정렬
		sort(array, 0, array.length-1);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
//	static void sort(int[] data, int l, int r){
//        int left = l;
//        int right = r;
//        int pivot = data[(l+r)/2];
//        
//        do{
//            while(data[left] < pivot) left++;
//            while(data[right] > pivot) right--;
//            if(left <= right){    
//                int temp = data[left];
//                data[left] = data[right];
//                data[right] = temp;
//                left++;
//                right--;
//            }
//        }while (left <= right);
//        
//        if(l < right) sort(data, l, right);
//        if(r > left) sort(data, left, r);
//    }
	
	static void sort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l+r)/2];
		
		do {
			while(data[left] < pivot) {
				left++;
			}
			
			while(data[right] > pivot) {
				right--;
			}
			
			if(left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while(left <= right);
		
		if(l < right) {
			sort(data, l, right);
		}
		if(r > left) {
			sort(data, left, r);
		}
	}
	
}
