package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11383 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[n][m];
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			
			for(int j=0; j<m; j++) {
				arr[i][j] = input.charAt(j);
			}
		}
		
		char[][] doubleArr = new char[n][2*m];
	
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			
			for(int j=0; j<2*m; j++) {
				doubleArr[i][j] = input.charAt(j);
			}
		}
		
		String answer = "Eyfa";
		
		loop:
		for(int i=0; i<n; i++) {
			for(int j=0; j<2*m; j++) {
				char c = arr[i][j/2];
				
				if(doubleArr[i][j] != c) {
					answer = "Not Eyfa";
					break loop;
				}
			}
		}
		
		System.out.println(answer);
	}
}
