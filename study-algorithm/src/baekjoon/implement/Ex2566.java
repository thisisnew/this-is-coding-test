package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] array = new int[9][9];
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<9; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = 0;
		int a = 0;
		int b = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				
				int n = array[i][j];
				
				if(n > max) {
					max = n;
					a = i;
					b = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((a+1) + " " + (b+1));
	}
}
