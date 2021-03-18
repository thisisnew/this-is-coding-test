package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ex1264 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine().toLowerCase();
		
		List<Character> list = Arrays.asList('a','e','i','o','u');
		
		while(true) {
			
			int cnt = 0;
			
			for(int i = 0; i<input.length(); i++) {
				
				char c = input.charAt(i);
				
				if(list.contains(c)) {
					cnt++;
				}
				
			}
			
			System.out.println(cnt);
			
			input = br.readLine().toLowerCase();
			if(input.equals("#")) {
				break;
			}
		}
		
	}
}
