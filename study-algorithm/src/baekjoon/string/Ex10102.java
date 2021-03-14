package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10102 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		char[] array = new char[n];
		
		String input = br.readLine();
		
		for(int i=0; i<array.length; i++) {
			array[i] = input.charAt(i);
		}
		
		int aCnt = 0;
		int bCnt = 0;
		
		for(char c : array) {
			
			if(c == 'A') {
				aCnt++;
			}
			
			if(c == 'B') {
				bCnt++;
			}
		}
		
		if(aCnt == bCnt) {
			System.out.println("Tie");
		} else if(aCnt > bCnt) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
