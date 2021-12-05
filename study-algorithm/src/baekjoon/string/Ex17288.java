package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex17288 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String num = "";
		int res = 0;
		for (int i = 0; i < input.length() - 1; i++) {
			int m = Integer.parseInt(Character.toString(input.charAt(i)));
			int n = Integer.parseInt(Character.toString(input.charAt(i + 1)));
			if (m + 1 == n) {
				num += input.charAt(i);
			} else {
				num = Character.toString(input.charAt(i));
				continue;
			}
			
			if(num.length() == 3) {
				res++;
				num = "";
			}
		}
		
		System.out.println(res);
	}

}
