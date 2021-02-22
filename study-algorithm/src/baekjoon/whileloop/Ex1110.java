package baekjoon.whileloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = String.valueOf(n);
		int cnt = 1;
		
		while(true) {
			
			if(str.length() == 1) {
				str = "0" + str;
			}
			
			int a = str.charAt(0) - '0';
			int b = str.charAt(1) - '0';
			String c = String.valueOf(a + b);
			
			if(c.length() == 1) {
				c = "0" + c;
			}
			
			String gen = Character.toString(str.charAt(1)) + Character.toString(c.charAt(1)); 
			
			if(n == Integer.parseInt(gen)) {
				break;
			} else {
				str = gen;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
