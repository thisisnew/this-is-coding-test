package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1855 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		int row = input.length()/n;
		
		char[][] array = new char[row][n];
		
		int idx = 0;

		for(int i=0; i<row; i++) {
			if(i % 2 == 1) {
				for(int j=n-1; j>=0; j--) {
					array[i][j] = input.charAt(idx);
					idx++;
				}
			} else {
				for(int j=0; j<n; j++) {
					array[i][j] = input.charAt(idx);
					idx++;
				}
			}
		}

		String answer = "";
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<row; j++) {
				answer += array[j][i];
			}
		}
		
		System.out.println(answer);
	}
}
