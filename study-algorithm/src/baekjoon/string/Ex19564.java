package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex19564 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		char f = input.charAt(0);
		
		int cnt = 1;
		
		for(int i=1; i<input.length(); i++) {
			
			char c = input.charAt(i);
			
			if(f >= c) {
				cnt++;
			}
			
			f = c;
		}
		
		System.out.println(cnt);
		
	}
}
