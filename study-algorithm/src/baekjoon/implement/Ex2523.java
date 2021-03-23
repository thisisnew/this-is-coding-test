package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2523 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		
		for(int i=1; i<=2*n-1; i++) {
			
			for(int j=0; j<cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i >= n) {
				cnt--;
			} else {
				cnt++;
			}
			
		}
	}
}
