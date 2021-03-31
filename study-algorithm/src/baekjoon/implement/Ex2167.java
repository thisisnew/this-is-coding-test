package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2167 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] array = new int[n][m];
		
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<m; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		
		for(int a=0; a<k; a++) {
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			
			for(int q=i-1; q<x; q++) {
				for(int r=j-1; r<y; r++) {
					sum += array[q][r];
				}
			}
			
			System.out.println(sum);
		}
		
	}
}
