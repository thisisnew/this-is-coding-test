package baekjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11170 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			int cnt = 0;

			for (int a = j; a <= k; a++) {
				if (a % 10 == 0) {
					cnt += countZeros(a);
				}
			}

			System.out.println(cnt);
		}

	}
	
	private static int countZeros(int input) {
		
		int cnt = 0;
		
		while(true) {
			
			int remain = input / 10;
			
			if(remain < 10) {
				break;
			}
			
			cnt++;
			
			input = remain;
		}
		
		return cnt;
	}
	
}
