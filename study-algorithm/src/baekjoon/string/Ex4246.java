package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4246 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int len = input.length();
		int cnt = 0;
		int idx = 0;
		
		String result = "";
		
		while(true) {
			
			if(idx > len) {
				cnt++;
				idx = cnt;
			}
			
			result += input.charAt(idx);
			
			idx += n;
			
			if(result.length() >= len) {
				break;
			}
		}
		
		System.out.println(result);
	}
}
