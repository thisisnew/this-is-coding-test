package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10941 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		byte[] ByteArray = decode(input);
		
		String result = new String(ByteArray);
		
		System.out.println(result);
		
	}

	public static byte[] decode(String s) {
		int len = s.length();
		byte[] r = new byte[len / 2];
		for (int i = 0; i < r.length; i++) {
			int digit1 = s.charAt(i * 2), digit2 = s.charAt(i * 2 + 1);
			if (digit1 >= '0' && digit1 <= '9')
				digit1 -= '0';
			else if (digit1 >= 'A' && digit1 <= 'F')
				digit1 -= 'A' - 10;
			if (digit2 >= '0' && digit2 <= '9')
				digit2 -= '0';
			else if (digit2 >= 'A' && digit2 <= 'F')
				digit2 -= 'A' - 10;

			r[i] = (byte) ((digit1 << 4) + digit2);
		}
		return r;
	}
}
