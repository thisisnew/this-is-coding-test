package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Ex15351 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			String input = br.readLine();
			
			int sum = 0;
			
			for(int j=0; j<input.length(); j++) {
				
				char c = input.charAt(j);
				if(c == ' ') {
					continue;
				}
				
				int v = (int)c -64;
				sum += v;
			}
			
			if(sum == 100) {
				System.out.println("PERFECT LIFE");
			} else {
				System.out.println(sum);
			}
			
		}
		
	}
}
