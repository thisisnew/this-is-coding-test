package baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());

		int result = 0;

		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(st.nextToken());

			if (input != v) {
				continue;
			}

			result++;
		}

		System.out.println(result);
	}
}
