package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2902 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		boolean isHyphen = true;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<input.length(); i++) {
			
			if(isHyphen) {
				sb.append(input.charAt(i));
				
				isHyphen = false;
			}
			
			if(input.charAt(i) == '-') {
				isHyphen = true;
			}
		}
		
		System.out.println(sb);
		
	}
}
