package baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		calc(n);
	}
	
	static void calc(int n) {
		
		int cnt = 0;
		
		if(n >= 100) {
			
			cnt += 99;
			
			for(int i=100; i<=n; i++) {
				String value = String.valueOf(i);
				
				int a = value.charAt(0) - '0';
				int b = value.charAt(1) - '0';
				int c = value.charAt(2) - '0';
				 
				if(c-b == b-a) {
					cnt++;
				}
				
			}
			
		} else {
			cnt = n;
		}
		
		System.out.println(cnt);
	}
}
