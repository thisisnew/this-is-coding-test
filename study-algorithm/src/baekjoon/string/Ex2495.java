package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2495 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[3];
		
		for(int i=0; i<arr.length; i++) {
			String numbers = br.readLine();
			
			arr[i] = numbers;
		}
		
		for(String number : arr) {
			char c = number.charAt(0);
			int max = 1;
			int cnt = 1;
			for(int j=1; j<number.length(); j++) {
				if(c == number.charAt(j)) {
					cnt++;
				} else {
					cnt = 1;
				}
				
				if(cnt > max) {
					max = cnt;
				}
				
				c = number.charAt(j);
			}
			
			System.out.println(max);
		}
		
	}
}
