package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3449 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String a = br.readLine();
			String b = br.readLine();
			
			int cnt = 0;
			
			for(int j=0; j<a.length(); j++) {
				
				char c = a.charAt(j);
				char d = b.charAt(j);
				
				if(c != d) {
					cnt++;
				}
				
			}
			
			System.out.println("Hamming distance is " + cnt + ".");
		}
		
	}
}
