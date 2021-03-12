package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7600 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		while(true) {
			
			input = input.toLowerCase();
			
			boolean[] array = new boolean[26];
			
			for(int i=0; i<input.length(); i++) {
				
				int idx = (int)input.charAt(i);
				
				if(idx >=97 && idx <= 122) {
					array[idx - 97] = true;
				}
			}
			
			int answer = 0;
			
			for(boolean b : array) {
				if(b) {
					answer++;
				}
			}
			
			System.out.println(answer);
			
			input = br.readLine();
			
			if(input.equals("#")) {
				break;
			}
		}
	}
}
