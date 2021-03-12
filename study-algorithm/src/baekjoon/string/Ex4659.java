package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ex4659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		List<Character> vowels = Arrays.asList('a','e','i','o','u');
		
		while(true) {
			
			int vowelCnt = 0;
			int consoCnt = 0;
			
			char tempChar = input.charAt(0);
			
			boolean hasVowel = false;
			boolean isAcceptable = false;
			boolean isContinue = false;
			
			if(vowels.contains(tempChar)) {
				vowelCnt++;
				hasVowel = true;
			} else {
				consoCnt++;
			}
			
			for(int i=1; i<input.length(); i++) {
				
				char c =  input.charAt(i);
				
				if(vowels.contains(c)) {
					hasVowel = true;
					vowelCnt++;
					consoCnt = 0;
				} else {
					consoCnt++;
					vowelCnt = 0;
				}
				
				if(vowelCnt == 3 || consoCnt == 3) {
					break;
				}
				
				if(tempChar == c) {
					if(tempChar == 'e' || tempChar == 'o') {
						continue;
					} else {
						isContinue = true;
						break;
					}
				}
				
				tempChar = c;
			}
			
			if(hasVowel && vowelCnt < 3 && consoCnt < 3 && !isContinue) {
				isAcceptable = true;
			}
			
			if(!isAcceptable) {
				System.out.println("<" + input + ">" + " is not acceptable.");
			} else {
				System.out.println("<" + input + ">" + " is acceptable.");
			}
			
			input = br.readLine();
			
			if(input.equals("end")) {
				break;
			}
			
		}
		
	}
}
