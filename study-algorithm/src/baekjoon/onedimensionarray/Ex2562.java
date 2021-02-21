package baekjoon.oneDimensionArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] answer = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > answer[0]) {
				answer[0] = arr[i];
				answer[1] = i+1;
			}
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
	}
}
