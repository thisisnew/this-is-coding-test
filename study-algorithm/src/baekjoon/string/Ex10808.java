package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10808 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[123]; 
		String input = br.readLine();
		
		for(int i=0; i<input.length(); i++) {
			int a = input.charAt(i);
			arr[a] += 1; 
		}
	
		for(int i=97; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
