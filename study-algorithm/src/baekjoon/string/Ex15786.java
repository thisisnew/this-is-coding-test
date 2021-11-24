package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex15786 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[] arr = new char[n];

		String input = br.readLine();

		for (int i = 0; i < n; i++) {
			arr[i] = input.charAt(i);
		}

		for (int i = 0; i < m; i++) {
			String compStr = br.readLine();
			int idx = 0;

			for (int j = 0; j < compStr.length(); j++) {
				char c = compStr.charAt(j);
				
				if(c == arr[idx]) {
					
				}
			}

		}
	}
}
