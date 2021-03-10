package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			
			String input = br.readLine();
			int mid = input.length() / 2; 
			
			char a = input.charAt(mid-1);
			char b = input.charAt(mid);
		
			String answer = "Do-it";
			
			if(a != b) {
				answer += "-Not";
			}
			
			System.out.println(answer);
		}
	}
}
