package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex15813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[26];
		
		String input = br.readLine();
		
		for(int i=0; i<n; i++) {
			array[input.charAt(i) - 'A']++;
		}
		
		int answer = 0;
		
		for(int i=0; i<array.length; i++) {
			answer += ((i + 1) * array[i]);
		}
		
		System.out.println(answer);
		
	}
}
