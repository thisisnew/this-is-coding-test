package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ex10987 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int answer = 0;
		List<String> vowels = Arrays.asList("a","e","i","o","u");
		
		for(int i=0; i<input.length(); i++) {
			
			String s = Character.toString(input.charAt(i));
			if(vowels.contains(s)) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
