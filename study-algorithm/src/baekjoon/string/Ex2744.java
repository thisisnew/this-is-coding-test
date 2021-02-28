package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2744 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String answer = "";
		
		for(int i=0; i<input.length(); i++) {
			int c = (int) input.charAt(i);
			
			if(c > 96) {
				answer += Character.toString(c).toUpperCase();
			} else {
				answer += Character.toString(c).toLowerCase();
			}
		}
		
		System.out.println(answer);
	}
}
