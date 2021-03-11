package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17249 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int leftCnt = 0;
		int rightCnt = 0;
		boolean isLeft = true;
		
		for(int i=0; i<input.length(); i++) {
			
			char c = input.charAt(i);
			
			if(c == ')') {
				isLeft = false;
			}
			
			if(c == '@') {
				if(isLeft) {
					leftCnt++;
				} else {
					rightCnt++;
				}
			}
		}
		
		System.out.println(leftCnt + " " + rightCnt);
		
	}
}
