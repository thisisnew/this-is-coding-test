package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4606 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		while(true) {
			String answer = "";
			
			for(int i=0; i<input.length(); i++) {
				
				char c = input.charAt(i);
				
				if(c == ' ') {
					answer += "%20";
					continue;
				}
				
				if(c == '!') {
					answer += "%21";
					continue;
				}
				
				if(c == '$') {
					answer += "%24";
					continue;
				}
				
				if(c == '%') {
					answer += "%25";
					continue;
				}
				
				if(c == '(') {
					answer += "%28";
					continue;
				}
				
				if(c == ')') {
					answer += "%29";
					continue;
				}
				
				if(c == '*') {
					answer += "%2a";
					continue;
				}
				
				answer += c;
				
			}
			
			System.out.println(answer);
			
			input = br.readLine();
			
			if(input.equals("#")) {
				break;
			}
			
		}
		
	}
}
