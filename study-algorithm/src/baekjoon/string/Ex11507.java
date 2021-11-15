package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11507 {

	private static boolean[][] ARRAY = new boolean[4][13];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		String word = "";

		boolean isGreska = false;

		for (int i = 0; i < input.length(); i++) {
			if (i > 0 && i % 3 == 0) {
				String result = putArray(word);

				if (result.equals("GRESKA")) {
					isGreska = true;
					break;
				}

				word = "";
				word += input.charAt(i);
			} else if (i == input.length() - 1) {
				word += input.charAt(i);
				String result = putArray(word);

				if (result.equals("GRESKA")) {
					isGreska = true;
					break;
				}
			} else {
				word += input.charAt(i);
			}
		}

		if (isGreska) {
			System.out.println("GRESKA");
		} else {
			int cnt = 0;
			StringBuffer sb = new StringBuffer();

			for (int i = 0; i < ARRAY.length; i++) {
				for (int j = 0; j < ARRAY[i].length; j++) {
					if (!ARRAY[i][j]) {
						cnt++;
					}
				}
				sb.append(String.valueOf(cnt)).append(" ");
				cnt = 0;
			}

			System.out.println(sb.toString().trim());

		}
	}

	private static String putArray(String word) {

		String s = word.substring(0, 1);
		int n = Integer.parseInt(word.substring(1));

		int idx = 0;

		if (s.equals("P")) {
			idx = 0;
		}

		if (s.equals("K")) {
			idx = 1;
		}

		if (s.equals("H")) {
			idx = 2;
		}

		if (s.equals("T")) {
			idx = 3;
		}

		String result = "";

		if (ARRAY[idx][n]) {
			result = "GRESKA";
		} else {
			ARRAY[idx][n] = true;
		}

		return result;
	}
}
