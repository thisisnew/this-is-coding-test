package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5704 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		while(true) {
			
			boolean[] isPangram = new boolean[26];
			
			for(int i=0; i<input.length(); i++) {
				char c = input.charAt(i);
				
				if(c == ' ') {
					continue;
				}
				
				isPangram[(int) c - 97] = true;
			}
			
			boolean isP = true;
			
			for(int i=0; i<isPangram.length; i++) {
				
				if(!isPangram[i]) {
					isP = false;
					break;
				}
			}
			
			if(isP) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
			
			input = br.readLine();
			if(input.equals("*")) {
				break;
			}
			
		}
	}
}
