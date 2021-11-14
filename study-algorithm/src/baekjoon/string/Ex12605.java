package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex12605 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			String[] arr = new String[st.countTokens()];

			int idx = 0;
			while (st.hasMoreTokens()) {
				arr[idx] = st.nextToken();
				idx++;
			}
			int x = i + 1;
			System.out.println("Case #" + x + ": " + makeString(arr));
		}

	}

	public static String makeString(String[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int j = arr.length - 1; j >= 0; j--) {
			sb.append(arr[j]).append(" ");
		}
		return sb.toString().trim();
	}
}
