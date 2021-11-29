package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex16499 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			
			input = sortString(input);
			
			if (!map.containsKey(input)) {
				map.put(input, input);
			}
		}
		
		System.out.println(map.size());
		
	}

	private static String sortString(String value) {

		char[] arr = new char[value.length()];

		for (int i = 0; i < value.length(); i++) {
			arr[i] = value.charAt(i);
		}
		
		Arrays.sort(arr);
		
		return String.valueOf(arr);
	}
}
