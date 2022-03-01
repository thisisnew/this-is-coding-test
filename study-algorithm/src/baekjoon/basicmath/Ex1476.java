package baekjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1476 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int e = 1, s = 1, m = 1;

		int year = 1;

		while (true) {

			if (e == E && s == S && m == M) {
				break;
			}

			e++;
			s++;
			m++;

			year++;

			if (e > 15) {
				e = 1;
			}

			if (s > 28) {
				s = 1;
			}

			if (m > 19) {
				m = 1;
			}
		}

		System.out.println(year);
	}
}
