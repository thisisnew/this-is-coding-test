package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14405 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ans = "YES";
		
		String input = br.readLine();
		
		int i = 0;
		
		while(i < input.length()) {
			
			if (i+1 < input.length() && input.charAt(i) == 'p' && input.charAt(i+1) == 'i') {
				i+=2;
			} else if (i+1 < input.length() && input.charAt(i) == 'k' && input.charAt(i+1) == 'a') {
				i+=2;
			} else if (i+2 < input.length() && input.charAt(i) == 'c' &&  input.charAt(i+1) == 'h' && input.charAt(i+2) == 'u') {
				i+=3;
			} else {
				ans = "NO";
				break;
			}
			
		}
		
		System.out.println(ans);
	}
}
