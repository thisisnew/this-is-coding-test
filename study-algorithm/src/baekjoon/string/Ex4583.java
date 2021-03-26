package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ex4583 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Character> mirrorWords = Arrays.asList('b','d','p','q','i','o','v','w','x');
		
		String input = br.readLine();
		
		while(true) {
			
			String answer = "";
			
			for(int i=input.length()-1; i>=0; i--) {
				char c = input.charAt(i);
				
				if(!mirrorWords.contains(c)) {
					answer = "INVALID";
					break;
				}
				
				if(c == 'b') {
					answer += 'd';
					continue;
				}
				
				if(c == 'd') {
					answer += 'b';				
					continue;
				}
				
				if(c == 'p') {
					answer += 'q';
					continue;
				}
				
				if(c == 'q') {
					answer += 'p';
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
