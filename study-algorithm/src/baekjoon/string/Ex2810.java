package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		char[] arrays = new char[n];
		
		String input = br.readLine();
		
		for(int i=0; i<input.length(); i++) {
			arrays[i] = input.charAt(i);
		}
		
		String answer = "";
		int cnt = 1;
		
		for(int i=0; i<arrays.length; i++) {
			answer += arrays[i];
			
			if(answer.equals("S") || answer.equals("LL")) {
				cnt++;
				answer = "";
			}
			
		}
		
		if(cnt > n) {
			System.out.println(n);
		} else {
			System.out.println(cnt);
		}
	}
}
