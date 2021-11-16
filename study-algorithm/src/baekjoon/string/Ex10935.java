package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class Ex10935 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		byte[] inputByte = input.getBytes();

		String base64String = Base64.getEncoder().encodeToString(inputByte);

		System.out.println(base64String);

	}
}
