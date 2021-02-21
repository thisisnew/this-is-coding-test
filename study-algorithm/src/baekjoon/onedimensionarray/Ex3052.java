package baekjoon.onedimensionarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		int answer = 0;
		
		for(int i=0; i<arr.length; i++) {
			int n = arr[i];
			
			for(int j=i+1; j<arr.length; j++) {
				if(n == arr[j]) {
					break;
				}
				
				if(j == arr.length - 1) {
					if(n != arr[j]) {
						answer++;
					}
				}
			}
			
		}
		
		System.out.println(answer+1);
	}
}
