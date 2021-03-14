package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3059 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			int sum = 0;
			
			boolean[] isCapital = new boolean[26];
			
			String input = br.readLine();
			
			for(int j=0; j<input.length(); j++) {
				
				int a = (int) input.charAt(j);
				
				if(65 <= a && a <= 90) {
					isCapital[a - 'A'] = true;
				}
			}
			
			for(int j=0; j<isCapital.length; j++) {
				
				if(!isCapital[j]) {
					sum += (j + 65);
				}
			}
			
			System.out.println(sum);
		}
	}
}
