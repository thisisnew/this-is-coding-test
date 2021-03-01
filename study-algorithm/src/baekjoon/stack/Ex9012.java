package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9012 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			
			String result = "YES";
			String input = br.readLine();
			int size = 0;
			
			for(int j=0; j<input.length(); j++) {
				
				char c = input.charAt(j);
				
				if(c == '(') {
					size++;
				} else {
					if(size == 0) {
						result = "NO";
						break;
					}
					
					size--;
				}
			}
			
			if(size != 0) {
				result = "NO";
			}
			
			sb.append(result).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
