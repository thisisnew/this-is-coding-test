package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex20540 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			
			if(c == 'E') {
				System.out.print('I');
			}
			
			if(c == 'I') {
				System.out.print('E');
			}
			
			if(c == 'S') {
				System.out.print('N');
			}
			
			if(c == 'N') {
				System.out.print('S');
			}
			
			if(c == 'T') {
				System.out.print('F');
			}
			
			if(c == 'F') {
				System.out.print('T');
			}
			
			if(c == 'J') {
				System.out.print('P');
			}
			
			if(c == 'P') {
				System.out.print('J');
			}
		}
	}
}
