package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ex1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String answer = "";
		
		if (word.length() > 1) {

			String[] arr = word.split("");
			HashMap<String, Integer> map = new HashMap<String, Integer>();

			int max = 0;

			for (String s : arr) {
				if (map.containsKey(s.toUpperCase())) {
					int cnt = map.get(s.toUpperCase());
					cnt++;

					if (cnt > max) {
						max = cnt;
					}

					map.put(s.toUpperCase(), cnt);
				} else {
					map.put(s.toUpperCase(), 1);
				}
			}

			int cnt = 0;
			for (String key : map.keySet()) {
				if (map.get(key) == max) {
					cnt++;
					answer = key;
				}

				if (cnt > 1) {
					answer = "?";
					break;
				}
			}
		} else {
			answer = word.toUpperCase();
		}
		
		System.out.println(answer);
	}
}
