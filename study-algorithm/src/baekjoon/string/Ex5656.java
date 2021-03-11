package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex5656 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int cnt = 1;

		while (true) {

			StringTokenizer st = new StringTokenizer(input);

			int a = Integer.parseInt(st.nextToken());
			String op = st.nextToken();
			int b = Integer.parseInt(st.nextToken());

			if(op.equals("E")) {
				break;
			}
			
			boolean isTrue = calc(a, op, b);

			System.out.println("Case " + cnt + ": " + isTrue);

			input = br.readLine();

			cnt++;
		}
	}

	static boolean calc(int a, String op, int b) {

		if (op.equals(">")) {
			return a > b;
		}

		if (op.equals(">=")) {
			return a >= b;
		}

		if (op.equals("<")) {
			return a < b;
		}

		if (op.equals("<=")) {
			return a <= b;
		}

		if (op.equals("==")) {
			return a == b;
		}

		if (op.equals("!=")) {
			return a != b;
		}
		
		return false;
	}
}
