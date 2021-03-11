package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex18406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int len = input.length()/2;
		
		String left = input.substring(0, len); 
		String right = input.substring(len);
		
		int lSum = 0;
		for(int i=0; i<left.length(); i++) {
			lSum += left.charAt(i) - '0';
		}
		
		int rSum = 0;
		for(int i=0; i<right.length(); i++) {
			rSum += right.charAt(i) - '0';
		}

		if(lSum == rSum) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}
	}
}
