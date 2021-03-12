package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12780 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String H = br.readLine();
		String N = br.readLine();
		
		int hLen = H.length();
		int nLen = N.length();
		
		int answer = 0;
		
		for (int i = 0; i <= hLen-nLen; i++) {
			if (H.substring(i, i+nLen).equals(N)) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}
}
