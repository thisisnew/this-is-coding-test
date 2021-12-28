package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.StringTokenizer;

public class Ex12606 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String[] arr = new String[st.countTokens()];
			int cnt = 0;
			while (st.hasMoreTokens()) {
				arr[cnt] = st.nextToken();
				cnt++;
			}

			System.out.print("Case #" + (i + 1) + ": ");
			System.out.println(String.join(" ", arr));
		}
	}
}
