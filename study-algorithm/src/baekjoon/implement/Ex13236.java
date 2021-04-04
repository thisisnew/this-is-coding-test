package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Ex13236 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.print(n + " ");
		
		while(n > 1) {
			
			if(n % 2 == 0) {
				n = n/2;
				System.out.print(n + " ");
				continue;
			}
			
			if(n % 2 != 0) {
				n = n * 3 + 1;
				System.out.print(n + " ");
				continue;
			}
		}
		
	}
}
