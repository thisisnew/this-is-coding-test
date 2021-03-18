package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ex11319 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Character> list = Arrays.asList('a','e','i','o','u');
		
		int s = Integer.parseInt(br.readLine());
		
		for(int i=0; i<s; i++) {
			String input = br.readLine().toLowerCase();
			int consLen = 0;
			int vowelLen = 0;
			
			for(int j=0; j<input.length(); j++) {
				
				char c = input.charAt(j);
				
				if(c == ' ') {
					continue;
				}
				
				if(list.contains(c)) {
					vowelLen++;
				} else {
					consLen++;
				}
			}
			
			System.out.println(consLen + " " + vowelLen);
		}
	}
}
