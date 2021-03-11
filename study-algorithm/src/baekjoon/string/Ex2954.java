package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ex2954 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Character> vowels = Arrays.asList('a','e','i','o','u');
		
		String input = br.readLine();
		
		String answer = "";
		
		int skip = 0;
		boolean isSkip = false;
		
		for(int i=0; i<input.length(); i++) {
			
			if(isSkip && skip == 2) {
				isSkip = false;
				skip = 0;
			}
			
			if(isSkip && skip < 2) {
				skip++;
				continue;
			}
			
			char c = input.charAt(i);

			answer += c;
			
			if(vowels.contains(c)) {
				isSkip = true;
			} 
		}
		
		System.out.println(answer);
		
	}
}
