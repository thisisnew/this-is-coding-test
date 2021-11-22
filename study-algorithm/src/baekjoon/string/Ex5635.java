package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex5635 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Map map = new HashMap<String, String>();
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {

			int cnt = 0;
			String name = "";
			String year = "";
			String month = "";
			String day = "";

			StringTokenizer st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {

				if (cnt == 0) {
					name = st.nextToken();
				} else if (cnt == 1) {
					day = convert(st.nextToken());
				} else if (cnt == 2) {
					month = convert(st.nextToken());
				} else if (cnt == 3) {
					year = convert(st.nextToken());
				}

				cnt++;
			}

			map.put(year + month + day, name);
			arr[i] = year + month + day;
		}

		Arrays.sort(arr);

		String max = arr[0];
		String min = arr[arr.length - 1];

		System.out.println(map.get(min));
		System.out.println(map.get(max));
	}

	private static String convert(String value) {
		int v = Integer.parseInt(value);

		if (v < 10) {
			value = "0" + value;
		}

		return value;
	}
}
