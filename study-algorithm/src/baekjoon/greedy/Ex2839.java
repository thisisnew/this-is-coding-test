package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int cnt = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(n % 5 != 0) {
			if(n <= 0) {
				break;
			}
			
			n -= 3;
			cnt++;
		}
		
		if(n > 0) {
			cnt += n/5;
			System.out.println(cnt);
		} else if(n == 0) {
			System.out.println(cnt);
		} else {
			System.out.println(-1);
		}
		
	}
}
