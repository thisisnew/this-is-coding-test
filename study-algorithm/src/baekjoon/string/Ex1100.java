package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1100 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] chess = new char[8][8];
		
		boolean isWhite = true;
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				
				if(isWhite) {
					chess[i][j] = 'w';
				} else {
					chess[i][j] = 'b';
				}
				
				isWhite = !isWhite;
			}
			isWhite = !isWhite;
		}
		
		int answer = 0;
		
		for(int i=0; i<8; i++) {
			String input = br.readLine();
			for(int j=0; j<8; j++) {
				
				if(input.charAt(j) == '.') {
					continue;
				}
				
				if(chess[i][j] == 'w') {
					answer++;	
				}
			}
		}
		System.out.println(answer);
	}
}
