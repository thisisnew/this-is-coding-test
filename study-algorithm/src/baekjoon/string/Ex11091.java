package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11091 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			boolean[] arr = new boolean[26];
			
			String input = br.readLine().toLowerCase();
			
			for(int j=0; j<input.length(); j++) {
				char c = input.charAt(j);
				
				if(c == ' ') {
					continue;
				}
				
				if(c >= 'a' && c <= 'z') {
					arr[(int)c - 'a'] = true;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			
			for(int j=0; j<arr.length; j++) {
				if(!arr[j]) {
					sb.append((char)(j+ 97));
				}
			}
			
			if(sb.length() > 0) {
				System.out.println("missing" + " " + sb.toString());
			} else {
				System.out.println("pangram");
			}
		}
	}
}
