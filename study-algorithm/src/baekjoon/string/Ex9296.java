package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex9296 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int caseCnt = 1;

		for (int i = 0; i < n; i++) {

			int m = Integer.parseInt(br.readLine());
			String input = br.readLine();
			String comp = br.readLine();
			int cnt = 0;
			for (int j = 0; j < m; j++) {
				if (input.charAt(j) != comp.charAt(j)) {
					cnt++;
				}
			}

			System.out.println("Case " + caseCnt + ":" + cnt);
			caseCnt++;
		}

	}

}
