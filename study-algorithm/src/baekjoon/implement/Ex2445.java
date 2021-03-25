package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int star = 0;
		int space = 0;
		int total = 2 * n;
		int cnt = 0;
		
		for(int i=1; i<=2*n-1; i++) {
			
			if(i <= n) {
				cnt = i;
			} else {
				cnt--;
			}
			
			star = 2*cnt;
			space = total - star;
			
			for(int j=0; j<star/2; j++) {
				System.out.print("*");
			}
			
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<star/2; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
