package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6359 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			int n= Integer.parseInt(br.readLine());
			
			boolean[] isOpen = new boolean[n+1];
			
			for(int j=1; j<=n; j++) {
				
				int k = 1;
				
				while(true) {
					int x = j * k;
					
					if(x > n) {
						break;
					}
					
					if(isOpen[x]) {
						isOpen[x] = false;
					} else {
						isOpen[x] = true;
					}
					
					k++;
				}
				
			}
			
			int cnt = 0;
			
			for(boolean b : isOpen) {
				if(b) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
	}
}
