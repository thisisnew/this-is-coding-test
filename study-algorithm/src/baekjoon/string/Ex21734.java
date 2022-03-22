package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21734 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		print(input);
	}

	
	private static void print(String input) {
		
		for(int i=0; i<input.length(); i++) {
			int num = (int)input.charAt(i) - 64;
			
			System.out.println(makeString(makeCount(num), input.charAt(i)));
		}
		
	}
	
	private static int makeCount(int num) {
		
		String n = String.valueOf(num);
		
		int cnt = 0;
		
		for(int i=0; i<n.length(); i++) {
			cnt+= Character.getNumericValue(n.charAt(i));
		}
		
		return cnt;
	}
	
	private static String makeString(int cnt, char c) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<cnt; i++) {
			sb.append(c);
		}
		
		return sb.toString();
	}
}
