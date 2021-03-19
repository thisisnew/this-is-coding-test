package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4447 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			
			String s = input.toLowerCase();
			
			int gCnt = 0;
			int bCnt = 0;
			
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				
				if(c == 'b') {
					bCnt++;
				}
				
				if(c == 'g') {
					gCnt++;
				}
			}
			
			if(bCnt == gCnt) {
				System.out.println(input + " is NEUTRAL");
				continue;
			}
			
			if(bCnt < gCnt) {
				System.out.println(input + " is GOOD");
				continue;
			}
			
			if(bCnt > gCnt) {
				System.out.println(input + " is A BADDY");
				continue;
			}
		}
		
	}
}
