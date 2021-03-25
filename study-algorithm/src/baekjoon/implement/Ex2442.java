package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2442 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int total = 2 * n - 1;
		int space = 0;
		int star = 0;
		
		for(int i=1; i<=n; i++) {
			star = 2*i-1;
			space = (total - star)/2;
			
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
