package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1755 {
	final static String[] ARRAY = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine" };

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
				int idx =  num.charAt(j) - '0';
				String s = ARRAY[idx];
				word.append(s).append(" ");
			}
			result.add(word.toString().trim());
		}
		
		Collections.sort(result);
		
		int cnt = 1;
		for(String r : result) {
			if (cnt == 10 ){
				System.out.println();
				cnt = 0;
			}
			System.out.print(r.length()+" ");
			cnt++;
		}
		
	}
}
