package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex16944 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			String input = br.readLine();
		}

	}
	
	private static boolean isMoreThenSixLetters(String value) {
		if(value.length() < 6) {
			return false;
		}
		
		return true;
	}
	
	private static boolean hasCapitalAlphabet(String value) {
		return true;
	}

	private static boolean hasSmallAlphabet(String value) {
		return true;
	}
	
	private static boolean hasSpecialCharacters(String value) {
		return true;
	}
	
}
