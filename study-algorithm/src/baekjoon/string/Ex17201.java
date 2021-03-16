package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17201 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String magnet = br.readLine();
		
		int len = magnet.length();
		
		int split = len/n;
		
		char c = '\0';
		
		boolean isConnected = true;
		
		for(int i=0; i<len; i++) {
			if(i != 0 && i % split == 0) {
				if(c == magnet.charAt(i)) {
					isConnected = false;
					break;
				}
			}
			
			c = magnet.charAt(i);
		}
		
		if(!isConnected) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
