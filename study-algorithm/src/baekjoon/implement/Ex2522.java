package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2522 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int k=0;
		int p=0;
		
		for(int i=1; i<=2*n-1; i++) {
			
			if(i > n) {
				k = i-n;
				p = n-k;
			} else {
				k = n-i;
				p = i;
			}
			
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<p; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
