package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1755 {
	final static String[] STRING_ARRAY = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven",
			"eight", "nine" };

	final static int[] INT_ARRAY = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) throws IOException {
		List<String> result = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		for (int i = m; i <= n; i++) {
			String num = String.valueOf(i);
			StringBuffer word = new StringBuffer();
			for (int j = 0; j < num.length(); j++) {
				int idx = num.charAt(j) - '0';
				String s = STRING_ARRAY[idx];
				word.append(s).append(" ");
			}
			result.add(word.toString().trim());
		}

		Collections.sort(result);

		int cnt = 0;
		for (String r : result) {
			if (cnt == 10) {
				System.out.println();
				cnt = 0;
			}
			
			String res = "";
			StringTokenizer st2 = new StringTokenizer(r);
			while(st2.hasMoreTokens()) {
				String i = st2.nextToken();
				int w = Arrays.asList(STRING_ARRAY).indexOf(i);
				res += String.valueOf(w);	
			}
		
			System.out.print(res + " ");
			cnt++;
		}

	}
}
