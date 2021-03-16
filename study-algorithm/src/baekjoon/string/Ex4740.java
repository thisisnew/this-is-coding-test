package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4740 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		while(true) {
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=input.length()-1; i>=0; i--) {
				sb.append(input.charAt(i));
			}
			
			System.out.println(sb);
			
			input = br.readLine();
			
			if(input.equals("***")) {
				break;
			}
		}
		
	}
}
