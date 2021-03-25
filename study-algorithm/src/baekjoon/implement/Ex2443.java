package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2443 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int total = 2*n-1;

		int cnt = n;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=n; i++) {
			
			int sTot = 2*cnt-1;
			int dTot = total - sTot;
			
			for(int j=0; j<dTot/2; j++) {
				sb.append(" ");
			}
			
			for(int j=0; j<sTot; j++) {
				sb.append("*");
			}
		
			if(i<n) {
				sb.append("\n");
			}
			
			cnt--;
		}
		
		System.out.println(sb);
	}
}
