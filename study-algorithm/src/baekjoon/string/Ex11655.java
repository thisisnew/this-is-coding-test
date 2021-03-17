package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11655 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String answer = "";
		
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			
			if(c == ' ') {
				answer += ' ';
				continue;
			}
			
			if(c >= '0' && c <= '9') {
				answer += c;
				continue;
			}
			
			if(c >= 'A' && c <= 'Z') {
				int n = (int)c + 13;
				
				if(n > 90) {
					n -= 26;
				}
				
				c = (char)n;
			}
			
			if(c >= 'a' && c <= 'z') {
				int n = (int)c + 13;
				
				if(n > 122) {
					n -= 26;
				}
				
				c = (char)n;
			}
			
			answer += c;
		}
		
		System.out.println(answer);
	}
}
