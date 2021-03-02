package baekjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Ex2775 {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] apt = new int[15][15];
		
		for(int i=0; i<=14; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			sb.append(apt[k][n]).append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
}
