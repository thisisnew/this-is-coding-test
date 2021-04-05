package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Ex17284 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		
		while(st.hasMoreTokens()) {
			
			int input = Integer.parseInt(st.nextToken());
			
			switch (input) {
				case 1: sum += 500; break; 
				case 2: sum += 800; break;
				case 3: sum += 1000; break;
			}
			
		}
		
		System.out.println(5000 - sum);
		
	}
}
